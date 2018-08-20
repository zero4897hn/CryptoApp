package com.example.zero.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.zero.cryptoapp.R;
import com.example.zero.model.Coin;

import java.util.ArrayList;

public class AdapterCoin extends ArrayAdapter<Coin> {
    Context context;
    int resource;
    ArrayList<Coin> coins;

    public AdapterCoin(@NonNull Context context, int resource, @NonNull ArrayList<Coin> objects) {
        super(context, resource, objects);
        this.coins = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.row_item, null);
        }
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvMarketCap = view.findViewById(R.id.tvMarketCap);
        TextView tvPrice = view.findViewById(R.id.tvPrice);
        TextView tvVolume = view.findViewById(R.id.tvVolume);
        Coin coin = coins.get(position);
        tvName.setText("Name: " + coin.getName());
        tvMarketCap.setText("Market Cap: " + coin.getMarketCap());
        tvPrice.setText("Price: " + coin.getPrice());
        tvVolume.setText("Volume: " + coin.getVolume());
        return view;
    }
}
