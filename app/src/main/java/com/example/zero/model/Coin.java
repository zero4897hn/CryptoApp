package com.example.zero.model;

import com.google.gson.annotations.SerializedName;

public class Coin {
    @SerializedName("long")
    String name;

    @SerializedName("mktcap")
    double marketCap;

    @SerializedName("price")
    double price;

    @SerializedName("volume")
    double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
