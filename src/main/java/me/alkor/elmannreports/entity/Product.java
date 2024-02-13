package me.alkor.elmannreports.entity;

public enum Product {
    GRAPE("ВИНОГРАД"),
    MILK_THISTLE("РАСТОРОПША"),
    WALNUT("ГРОРЕХ"),
    CITROKALCEVIT("ЦИТРОКАЛЬЦЕВИТ"),
    CIMICIFUGA("ЦИМИЦИФУГА"),
    NOVINKA("НОВИНКА");
    private final String prodName;

    Product(String prodName) {
        this.prodName = prodName;
    }

    public String getProdName() {
        return prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                '}';
    }
}
