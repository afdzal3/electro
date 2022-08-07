/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.service;

import electro.assignment.model.Customer;
import electro.assignment.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author afdzal
 */
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepo;
    
        public Long create(Customer customer) {

        customerRepo.save(customer);
        return customer.getId();
    }
    
}
