/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.springecommerce.service;

import com.luv2code.springecommerce.dao.CustomerRepository;
import com.luv2code.springecommerce.dto.Purchase;
import com.luv2code.springecommerce.dto.PurchaseResponse;
import com.luv2code.springecommerce.entity.Customer;
import com.luv2code.springecommerce.entity.Order;
import com.luv2code.springecommerce.entity.OrderItem;
import java.util.Set;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author channoufisaber
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        Customer customer = purchase.getCustomer();
        customer.add(order);

        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        
        return UUID.randomUUID().toString();
    }
}