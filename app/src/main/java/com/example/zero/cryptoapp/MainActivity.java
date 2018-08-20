package com.example.zero.cryptoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.zero.adapter.AdapterCoin;
import com.example.zero.model.Coin;
import com.example.zero.service.ApiService;
import com.example.zero.service.RestClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ArrayList<Coin> coins = new ArrayList<>();
    ListView listView;
    AdapterCoin adapterCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ApiService apiService = RestClient.getApiService();
        Call<ArrayList<Coin>> call = apiService.getCoins();
        call.enqueue(new Callback<ArrayList<Coin>>() {
            @Override
            public void onResponse(Call<ArrayList<Coin>> call, Response<ArrayList<Coin>> response) {
                coins = response.body();
                Log.e("coins", coins.size() + "");

                adapterCoin = new AdapterCoin(getBaseContext(), R.layout.row_item, coins);
                listView.setAdapter(adapterCoin);
            }

            @Override
            public void onFailure(Call<ArrayList<Coin>> call, Throwable t) {

            }
        });
    }

}
