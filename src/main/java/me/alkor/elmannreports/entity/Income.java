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
@Table(name = "income")
public class Income {
//    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "income_id",  nullable = false)
    private Long id;
    private int dateMonth;

    private double revenue;       //выручка
    private double credit;     //кредиты
    private double foundersLoan;      //займ учредителя
    private double unexpected;      //нежданчик - нетипичный доход

}
/*

@Builder


//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // позволяет классам наследникам сопоставляться со своей собственной таблицей
// общий класс для владельцев (нужно ли его делать АБСТРАКТНЫМ?)

public class Owner { // хозяин животного, его свойства


    @Id
    @Column(name = "owner_id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "owner_phone")
    private String phoneNumber;
 */