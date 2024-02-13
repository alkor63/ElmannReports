package me.alkor.elmannreports.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "net_cost")
public class NetCost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cost_id",  nullable = false)
    private Long id;
    private Product product;
    private double cost;
}
