/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.luv2code.springecommerce.dao;

import com.luv2code.springecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author channoufisaber
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
