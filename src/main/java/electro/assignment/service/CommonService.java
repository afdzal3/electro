/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.service;

import electro.assignment.model.Config;
import electro.assignment.repo.ConfigRepository;
import electro.assignment.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author afdzal
 */
@Service
@RequiredArgsConstructor
public class CommonService {

    private final ConfigRepository configRepo;

    public boolean getPopConfig() {

        Config conf = configRepo.findById("pop");
        if (conf == null) {
            System.out.println("config need to be set");
            return true;
        } else {
            System.out.println("config need not to be set");
            return false;
        }

    }

    public void popConfig() {
        Config conf = new Config("pop", "0");
        configRepo.save(conf);
    }

}
