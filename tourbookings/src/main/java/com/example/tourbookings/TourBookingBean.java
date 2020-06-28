package com.example.tourbookings;

public class TourBookingBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getTourName() {
        return tourName;
    }

    public TourBookingBean(String name, long price, String tourName) {
        this.name = name;
        this.price = price;
        this.tourName = tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    String name;
    long price;
    String tourName;
}
