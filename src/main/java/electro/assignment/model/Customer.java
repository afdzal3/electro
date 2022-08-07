/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;


import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author afdzal
 */

@Entity
@Table(name = "customers")
public class Customer {
@Id
@GeneratedValue
private Long id;
    
}
