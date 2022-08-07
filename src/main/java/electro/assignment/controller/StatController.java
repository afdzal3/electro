/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.controller;

import electro.assignment.model.Appliance;
import electro.assignment.model.Log;
import electro.assignment.repo.ApplianceRepository;
import electro.assignment.repo.LogRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author afdzal
 */
@RestController
@RequestMapping("/api/status")
@Transactional
public class StatController {

    private final ApplianceRepository applianceRepo;
    private final LogRepository logRepo;

    public StatController(ApplianceRepository applianceRepo, LogRepository logRepo) {
        this.applianceRepo = applianceRepo;
         this.logRepo = logRepo;

    }

    @GetMapping("/upd/{aid}/{stat}")
    public Appliance updStatus(
            @PathVariable("aid") String aid,
            @PathVariable("stat") String stat) {
        Appliance ap = applianceRepo.findById(aid);
        ap.setStatus(stat);
        applianceRepo.save(ap);
        
        Log log = new Log(ap,stat);
        logRepo.save(log);
        
        return applianceRepo.findById(aid);
              

    }
    
    @GetMapping("/list")
    public List<Appliance> getApps() {
         
        List<Appliance> appList = applianceRepo.findAll();
       
      
        
        return appList;
              

    }

}
