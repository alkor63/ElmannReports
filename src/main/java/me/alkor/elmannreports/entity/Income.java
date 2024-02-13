package me.alkor.elmannreports.entity;

public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",  nullable = false)
    private int id;
    private int dateMonth;

    private double revenue;       //выручка
    private double credit;     //кредиты
    private double foundersLoan;      //займ учредителя
    private double unexpected;      //нежданчик - нетипичный доход

}
