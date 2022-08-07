/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author afdzal
 */
@Entity
@Table(name = "configs")
@Data
public class Config {
    public Config(){}

    @Id
    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private String val;   
    
    public Config(
            String id, 
            String val
           ) {
    this.id = id;
    this.val = val;

  }
}