package me.alkor.elmannreports.entity;

public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",  nullable = false)
    private int id;
    private int dateMonth;

    private double taxes;       //налоги
    private double penalty;     //штрафы

    private double salary;      //зарплата сотрудников
    private double bonus;      //премии сотрудников

    private double rent;        //аренда помещений
    private double banking;        //банковское обслуживание
    private double creditBody;        //тело кредита
    private double creditPercent;        //проценты по кредитам

    private double transport;        //транспортные расходы
    private double telecom;        //услуги связи
    private double marketing;        //маркетинг, реклама
    private double expense;        //представительские расходы
    private double office;        //канцелярия, чай и т.п.

    private double goods;     //товар для продажи
    private double extract;     //сырьё, экстракты
    private double wrapper;     //упаковка (пеналы, этикетки и т.п.)
    private double packaging;   //гофротара
    private double servicesFarmProd;    //услуги ФармПродукта

    private double other;       //прочие расходы

    public Expenses() {
    }
}
