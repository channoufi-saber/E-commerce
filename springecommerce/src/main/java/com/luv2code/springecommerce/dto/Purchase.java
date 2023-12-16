/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.springecommerce.dto;

import com.luv2code.springecommerce.entity.Address;
import com.luv2code.springecommerce.entity.Customer;
import com.luv2code.springecommerce.entity.Order;
import com.luv2code.springecommerce.entity.OrderItem;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author channoufisaber
 */
@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
