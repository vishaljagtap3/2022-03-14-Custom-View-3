package com.aavidsoft.recyclerview2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CityDetailsActivity extends AppCompatActivity {

    private City city;

    private ImageView imgCity;
    private TextView txtCityName, txtState, txtPopulation, txtLocation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        city = (City) getIntent().getSerializableExtra(City.KEY_CITY);

        setContentView(R.layout.city_details_activity);
        init();
        bindDataToViews();
    }

    private void bindDataToViews() {
        imgCity.setImageResource(city.getImageId());
        txtCityName.setText(city.getName());
        txtState.setText(city.getState());
        txtPopulation.setText(String.valueOf(city.getPopulation()));
        txtLocation.setText(city.getLat() + " , " + city.getLng());
    }

    private void init() {
        imgCity = findViewById(R.id.imgCity);
        txtCityName = findViewById(R.id.txtCityName);
        txtState = findViewById(R.id.txtState);
        txtPopulation = findViewById(R.id.txtPopulation);
        txtLocation = findViewById(R.id.txtLocation);
    }
}
