package com.aavidsoft.recyclerview2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private ArrayList<City> citiesList;

    public CitiesAdapter(ArrayList<City> citiesList) {
        this.citiesList = citiesList;
    }

    public interface OnCityClickListener {
        void onCityImageClick(ImageView imageView, City city, int position);
        void onCityNameClick(TextView txtCity, City city, int position);
    }

    private OnCityClickListener onCityClickListener;

    public void setOnCityClickListener(OnCityClickListener onCityClickListener) {
        this.onCityClickListener = onCityClickListener;
    }

    class CityViewHolder extends RecyclerView.ViewHolder {

        CityView cityView;

        public CityViewHolder(View itemView) {
            super(itemView);
            cityView = (CityView) itemView;
        }
    }

    @Override
    public int getItemCount() {
        if(citiesList == null)
            return 0;

        return citiesList.size();
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new CityViewHolder(
                new CityView(parent.getContext(), null)
        );

    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, @SuppressLint("RecyclerView") int position) {

        City city = citiesList.get(position);
        holder.cityView.setCity(city);

    }
}
