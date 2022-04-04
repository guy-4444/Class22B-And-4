package com.guy.class22b_and_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.textview.MaterialTextView;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Activity_Weather extends AppCompatActivity {

    private MaterialTextView weather_LBL_date;
    private MaterialTextView weather_LBL_type;
    private MaterialTextView weather_LBL_temp;
    private MaterialTextView weather_LBL_wind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        findViews();

        String json = DataManager.getWeatherDataForLocation(32.0, 34.0);

        Log.d("pttt", "A");
        try {
            JSONObject object = new JSONObject(json);
            JSONObject mainObject = object.getJSONObject("main");
            double temperature = mainObject.getDouble("temp");
            temperature -= 273.15;

            JSONArray weatherArray = object.getJSONArray("weather");
            JSONObject firstWeatherObject = weatherArray.getJSONObject(0);
            String mainDesc = firstWeatherObject.getString("main");


            double wind = object.getJSONObject("wind").getDouble("speed");
            wind *= 3.6;

            Log.d("pttt", "mainDesc= " + mainDesc);
            Log.d("pttt", "temperature= " + temperature);
            Log.d("pttt", "wind= " + wind);

            City city = new City().setType(mainDesc).setTemp(temperature).setWind(wind);


        } catch (JSONException e) {
            e.printStackTrace();
            Log.d("pttt", "ex: " + e.getMessage());
        }
        Log.d("pttt", "B");


        Place place = new Gson().fromJson(json, Place.class);

        weather_LBL_date.setText(new SimpleDateFormat("dd.MM.yy HH:mm:ss", Locale.US).format(System.currentTimeMillis()));
        weather_LBL_type.setText(place.weather.get(0).main);
        double tempValue = place.main.temp - 273.15;
        //weather_LBL_temp.setText(new DecimalFormat("##.##").format(tempValue) + "°C");
        weather_LBL_temp.setText(String.format(Locale.US, "%.3f", tempValue) + "°C");
        weather_LBL_wind.setText(String.format(Locale.US, "%.3f", place.wind.speed * 3.6) + " kmH");
        int x = 0;


        //startTattoo();


        String js = "{\"artist\":{\"experience\":true,\"name\":\"Rom\"},\"colors\":[\"#FF0000\",\"#FF4FAE\"],\"name\":\"Sakura Tree\",\"needles\":{\"AAA\":2,\"CCC\":4,\"BBB\":1,\"DDD\":3},\"originalDesign\":false,\"price\":1600.9,\"size\":\"LARGE\"}";
        Tattoo tattoo = new Gson().fromJson(js, Tattoo.class);
        int y = 0;
    }

    private void startTattoo() {
        HashMap<String, Integer> needles = new HashMap<>();
        needles.put("AAA", 2);
        needles.put("BBB", 1);
        needles.put("CCC", 4);
        needles.put("DDD", 3);
        Tattoo tattoo = new Tattoo()
                .setName("Sakura Tree")
                .setPrice(1600.90)
                .setPainLevel(3)
                .setOriginalDesign(false)
                .setSize(Tattoo.SIZE.LARGE)
                .setColors(new ArrayList<>(Arrays.asList("#FF0000", "#FF4FAE")))
                .setNeedles(needles)
                .setArtist(new Artist()
                        .setName("Rom")
                        .setExperience(2)
                        .setMale(true)
                );


        String json = new Gson().toJson(tattoo);
        int x = 0;




    }

    private void findViews() {
        weather_LBL_date = findViewById(R.id.weather_LBL_date);
        weather_LBL_type = findViewById(R.id.weather_LBL_type);
        weather_LBL_temp = findViewById(R.id.weather_LBL_temp);
        weather_LBL_wind = findViewById(R.id.weather_LBL_wind);
    }
}