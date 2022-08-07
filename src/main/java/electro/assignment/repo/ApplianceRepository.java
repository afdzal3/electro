/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.repo;

import electro.assignment.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author afdzal
 */
public interface ApplianceRepository extends JpaRepository<Appliance, Long> {

    public Appliance findById(String aid);
    
}
