package electro.assignment;

import electro.assignment.model.Appliance;
import electro.assignment.model.Config;
import electro.assignment.model.Customer;
import electro.assignment.service.ApplianceService;
import electro.assignment.service.CommonService;
import electro.assignment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    ApplianceService applianceService;

    @Autowired
    CustomerService customerService;

    @Autowired
    CommonService commonService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... params) throws Exception {

        try {
            if (commonService.getPopConfig()) {

                Customer c1 = new Customer();
                c1.setName("Kalles Grustransporter AB");
                c1.setAddress("Cementvägen 8, 111 11 Södertälje");

                Customer c2 = new Customer();
                c2.setName("Johans Bulk AB");
                c2.setAddress("Balkvägen 12, 222 22 Stockholm");

                Customer c3 = new Customer();
                c3.setName("Haralds Värdetransporter AB");
                c3.setAddress("Budgetvägen 1, 333 33 Uppsala");

                Appliance ap1 = new Appliance("YS2R4X20005399401",
                        "ABC123", c1);
                Appliance ap2 = new Appliance("VLUR4X20009093588",
                        "DEF456", c1);
                Appliance ap3 = new Appliance("VLUR4X20009048066",
                        "GHI789", c1);

                Appliance ap4 = new Appliance("YS2R4X20005388011",
                        "JKL012", c2);
                Appliance ap5 = new Appliance("YS2R4X20005387949",
                        "MNO345", c2);
                Appliance ap6 = new Appliance("YS2R4X20009048066",
                        "PQR678", c3);
                Appliance ap7 = new Appliance("YS2R4X20005387055",
                        "STU901", c3);

                customerService.create(c1);
                customerService.create(c2);
                customerService.create(c3);

                applianceService.create(ap1);
                applianceService.create(ap2);
                applianceService.create(ap3);
                applianceService.create(ap3);
                applianceService.create(ap4);
                applianceService.create(ap5);
                applianceService.create(ap6);
                applianceService.create(ap7);
                
                commonService.popConfig();
                /**
                 * *
                 * |-----------------------------------| | Kalles
                 * Grustransporter AB | | Cementvägen 8, 111 11 Södertälje |
                 * |-----------------------------------| | AID (ApplianceId)
                 * Factory. nr. | |-----------------------------------| |
                 * YS2R4X20005399401 ABC123 | | VLUR4X20009093588 DEF456 | |
                 * VLUR4X20009048066 GHI789 |
                 * |-----------------------------------|
                 *
                 * |-----------------------------------| | Johans Bulk AB | |
                 * Balkvägen 12, 222 22 Stockholm |
                 * |-----------------------------------| | AID (ApplianceId)
                 * Factory. nr. | |-----------------------------------| |
                 * YS2R4X20005388011 JKL012 | | YS2R4X20005387949 MNO345 |
                 * ------------------------------------|
                 *
                 * |-----------------------------------| | Haralds
                 * Värdetransporter AB | | Budgetvägen 1, 333 33 Uppsala |
                 * |-----------------------------------| | AID (ApplianceId)
                 * Factory. nr. | |-----------------------------------| |
                 * YS2R4X20009048066 PQR678 | | YS2R4X20005387055 STU901 |
                 * |-----------------------------------|
                 *
                 *
                 */
            }
            else{
           
            
            
            
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

}
