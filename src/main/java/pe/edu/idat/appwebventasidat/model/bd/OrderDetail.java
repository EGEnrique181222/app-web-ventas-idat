package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.idat.appwebventasidat.model.bd.pk.OrderDetailId;

@NoArgsConstructor

@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId orderDetailId;
    @Column(name = "unitprice")
    private Double unitprice;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "discount")
    private Double discount;
}
