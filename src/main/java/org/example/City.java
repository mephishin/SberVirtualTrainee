package org.example;

import java.util.List;

public class City implements Comparable<City>{
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(String name, String region, String district, int population, String foundation, int id) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.name);
    }

    public static String findMax(List<City> cityList) {
        int max = 0;
        City maxPopCity = null;
        int cur = 0;
        for (City city: cityList) {
            cur = city.getPopulation();
            if (cur > max) {
                max = cur;
                maxPopCity = city;
            }
        }
        assert maxPopCity != null;
        return "[" + maxPopCity.getId() + "]" + " = " + max;
    }
}


