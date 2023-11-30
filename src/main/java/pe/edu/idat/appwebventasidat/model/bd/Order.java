package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    @Column(name = "orderdate")
    private Date orderdate;
    @Column(name = "requireddate")
    private Date requieddate;
    @Column(name = "shippeddate")
    private Date shippeddate;
    @Column(name = "shipvia")
    private Integer shipvia;
    @Column(name = "freight")
    private Double freight;
    @Column(name = "shipname")
    private String shipname;
    @Column(name = "shipaddress")
    private String shipaddress;
    @Column(name = "shipcity")
    private String shipcity;
    @Column(name = "shipregion")
    private String shipregion;
    @Column(name = "shippostalcode")
    private String shippostalcode;
    @Column(name = "shipcountry")
    private String shipcountry;
    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employeeid")
    private Employee employee;
}
