package com.example.zero.service;

import com.example.zero.model.Coin;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("front")
    Call<ArrayList<Coin>> getCoins();
}
