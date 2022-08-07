/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author afdzal
 */
@Entity
@Table(name = "appliances")
public class Appliance {
    public Appliance(){}

    @Id
    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private String fnr;

    @Setter
    @Getter
    private String status;

    @ManyToOne
    @Setter
    @Getter
    private Customer customer;
    
    
    public Appliance(
            String aid, 
            String fnr,
            Customer cus) {
    this.id = aid;
    this.fnr = fnr;
    this.status = "Disconnected";
    this.customer = cus;
  }
    

}
