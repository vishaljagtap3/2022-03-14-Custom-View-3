package com.aavidsoft.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<City> citiesList;
    private RecyclerView recyclerCities;
    private CitiesAdapter citiesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        citiesList = new ArrayList<>();
        citiesList.add(new City(R.mipmap.ic_launcher, "Pune", "Mahrashtra", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Mumbai", "Mahrashtra", 3100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Delhi", "Delhi", 2103000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Chennai", "Tamilnadu", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Jaipur", "Rajasthan", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Kolkata", "West Bengal", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Hyderabad", "Telangana", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Yavatmal", "Mahrashtra", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Nagpur", "Mahrashtra", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Nashik", "Mahrashtra", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Aurangabad", "Mahrashtra", 2100000, 18.50234, 72.39834));
        citiesList.add(new City(R.mipmap.ic_launcher, "Bengaluru", "Karnataka", 2100000, 18.50234, 72.39834));

        recyclerCities = findViewById(R.id.recyclerCities);
        recyclerCities.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );

        citiesAdapter = new CitiesAdapter(citiesList);
        recyclerCities.setAdapter(citiesAdapter);
    }
}