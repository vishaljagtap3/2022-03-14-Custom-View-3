package com.aavidsoft.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        citiesList.add(
                new City(
                        R.mipmap.ic_launcher, "Pune", "Mahrashtra", 2100000, 18.50234, 72.39834,
                        "Pune is Amazing... Smart People Festivals, Culture IT"
                )
        );
        citiesList.add(new City(R.mipmap.ic_launcher, "Mumbai", "Mahrashtra", 3100000, 18.50234, 72.39834, "Economical capital of India, Corporate, Bollywood, Sea, Humidity, Rush, FAst, Safe"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Delhi", "Delhi", 2103000, 18.50234, 72.39834, "Capital of India, Foody"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Chennai", "Tamilnadu", 2100000, 18.50234, 72.39834, "Capital of Tamilnadu, Nice CIty, bad weather"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Jaipur", "Rajasthan", 2100000, 18.50234, 72.39834, "Good things here.. good people.. bad infra"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Kolkata", "West Bengal", 2100000, 18.50234, 72.39834, "Fish city"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Hyderabad", "Telangana", 2100000, 18.50234, 72.39834, "This is sample description of the city"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Yavatmal", "Mahrashtra", 2100000, 18.50234, 72.39834, "This is sample"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Nagpur", "Mahrashtra", 2100000, 18.50234, 72.39834, "This is sample description of the city"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Nashik", "Mahrashtra", 2100000, 18.50234, 72.39834, "This is sample description of the city"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Aurangabad", "Mahrashtra", 2100000, 18.50234, 72.39834, "This is sample description of the city"));
        citiesList.add(new City(R.mipmap.ic_launcher, "Bengaluru", "Karnataka", 2100000, 18.50234, 72.39834, "This is sample description of the city"));

        recyclerCities = findViewById(R.id.recyclerCities);
        /*recyclerCities.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );*/
        recyclerCities.setLayoutManager(
                new GridLayoutManager(
                        this,
                        3
                )
        );

        citiesAdapter = new CitiesAdapter(citiesList);
        citiesAdapter.setOnCityClickListener(new MyOnCityClickListener());

        recyclerCities.setAdapter(citiesAdapter);
    }

    class MyOnCityClickListener implements CitiesAdapter.OnCityClickListener {

        @Override
        public void onCityImageClick(ImageView imageView, City city, int position) {
            Toast.makeText(MainActivity.this, "Image: " + city.getName(), Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCityNameClick(TextView txtCity, City city, int position) {

            txtCity.setTextColor(Color.RED);
            Toast.makeText(MainActivity.this, "TextView: " + city.getName(), Toast.LENGTH_LONG).show();

            Intent intent = new Intent(MainActivity.this, CityDetailsActivity.class);
            intent.putExtra(City.KEY_CITY, city);
            startActivity(intent);
        }
    }
}