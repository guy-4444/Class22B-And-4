package com.guy.class22b_and_4;

import java.util.ArrayList;

public class Place {

    public class Coord{
        public double lon;
        public double lat;
    }

    public class Weather{
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    public class Main{
        public double temp;
        public double feels_like;
        public double temp_min;
        public double temp_max;
        public int pressure;
        public int humidity;

        public Main() { }
    }

    public class Wind{
        public double speed;
        public int deg;

        public Wind() { }
    }

    public class Clouds{
        public int all;

        public Clouds() { }
    }

    public class Sys{
        public int type;
        public int id;
        public double message;
        public String country;
        public int sunrise;
        public int sunset;

        public Sys() { }
    }

    public Coord coord;
    public ArrayList<Weather> weather;
    public String base;
    public Main main;
    public int visibility;
    public Wind wind;
    public Clouds clouds;
    public int dt;
    public Sys sys;
    public int timezone;
    public int id;
    public String name;
    public int cod;

    public Place() { }

}
