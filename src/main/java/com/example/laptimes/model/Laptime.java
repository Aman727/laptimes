package com.example.laptimes.model;

public class Laptime {
    private Long id;
    private int position;
    private String username;
    private String circuit;
    private String car;
    private String time;
    private String date;
    private String weather;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Laptime{" +
                "id=" + id +
                ", position=" + position +
                ", username='" + username + '\'' +
                ", circuit='" + circuit + '\'' +
                ", car='" + car + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
