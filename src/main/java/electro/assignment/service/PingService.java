/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.service;

import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



/**
 *
 * @author afdzal
 */
@Service
@RequiredArgsConstructor
public class PingService {
public void pingApp(){    
try {
        while (true) {
            System.out.println(new Date());
            Thread.sleep(5 * 1000);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    
}
