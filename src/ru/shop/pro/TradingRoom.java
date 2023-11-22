package ru.shop.pro;

public class TradingRoom {
    private String name;
    private String[] consults;

    public TradingRoom(String name, String[] consults) {
        this.name = name;
        this.consults = consults;
    }

    public String getName() {
        return name;
    }
    public void setConsults(String[] consults) {
        this.consults = consults;
    }
}
