package pe.edu.idat.appwebventasidat.model.request;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.idat.appwebventasidat.model.bd.Customer;
import pe.edu.idat.appwebventasidat.model.bd.Employee;

import java.util.Date;
@Data
public class OrderRequest {
    private Integer orderid;
    private Date orderdate;
    private Date requieddate;
    private Date shippeddate;
    private Integer shipvia;
    private Double freight;
    private String shipname;
    private String shipaddress;
    private String shipcity;
    private String shipregion;
    private String shippostalcode;
    private String shipcountry;

    private String customerid;
    private Integer employeeid;
}
