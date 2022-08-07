/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.repo;

import electro.assignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author afdzal
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
