/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.service;

import electro.assignment.model.Appliance;
import electro.assignment.repo.ApplianceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author afdzal
 */
@Service
@RequiredArgsConstructor
public class ApplianceService {

    private final ApplianceRepository applianceRepo;

    public String create(Appliance appliance) {

        applianceRepo.save(appliance);
        return appliance.getId();
    }

}
