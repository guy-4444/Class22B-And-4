package com.guy.class22b_and_4;

public class City {

    private String type;
    private double temp;
    private double wind;

    public City() { }

    public String getType() {
        return type;
    }

    public City setType(String type) {
        this.type = type;
        return this;
    }

    public double getTemp() {
        return temp;
    }

    public City setTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public double getWind() {
        return wind;
    }

    public City setWind(double wind) {
        this.wind = wind;
        return this;
    }
}
