package com.luv2code.springecommerce.dto;


import lombok.Data;

/**
 *
 * @author channoufisaber
 */

@Data
public class PaymentInfo{
	private  int amount;
	private String currency;
	private String receiptEmail;
}