/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;


import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author afdzal
 */

@Entity
@Table(name = "customers")
@Data
public class Customer {
@Id
@Getter
@GeneratedValue
private Long id;

@Setter
@Getter
private String name;

@Setter
@Getter
private String address;
    
}
