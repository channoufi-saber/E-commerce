/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luv2code.springecommerce.service;

import com.luv2code.springecommerce.dto.PaymentInfo;
import com.luv2code.springecommerce.dto.Purchase;
import com.luv2code.springecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

/**
 *
 * @author channoufisaber
 */
public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
