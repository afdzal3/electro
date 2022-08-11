/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electro.assignment.model;

import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author afdzal
 */
@Entity
@Table(name = "logs")
public class Log {

    public Log() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @Getter
    private Appliance aid;

    @Getter
    private Date timestamp;

    @Getter
    private String status;
    


    public Log(
            Appliance aid,
            String status) {
        Date date = new Date(System.currentTimeMillis());
        this.aid = aid;
        this.status = status;
        this.timestamp = date;
    }

}
