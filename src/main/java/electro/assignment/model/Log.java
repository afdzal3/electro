/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author afdzal
 */
@Entity
@Table(name = "logs")
public class Log {

    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne
    private Appliance aid;
    
    private Date timestamp;
    
    private String status;
    


}
