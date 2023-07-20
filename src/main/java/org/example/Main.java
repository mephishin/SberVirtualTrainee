package org.example;


import java.io.IOException;

import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        // Вывод всех городов
        CSVReader csvReader = new CSVReader();
        List<City> cityList = csvReader.readCSV("cities.csv");
        List<City> cityList1 = new java.util.ArrayList<>(List.copyOf(cityList));
        List<City> cityList2 = new java.util.ArrayList<>(List.copyOf(cityList));
        for (City city: cityList) {
            System.out.println(city);
        }
        // Вывод городов отстортированных по имени
        Collections.sort(cityList1);
        for(City city: cityList1) {
            System.out.println(city);
        }
        // Вывод городов отсортированных по федеральному округу и наименованию города в каждом федеральном округе
        Collections.sort(cityList2, new DistrictNameComparator());
        for (City city: cityList2) {
            System.out.println(city);
        }
        // Вывод айди города максимального по населению
        System.out.println(City.findMax(cityList));
    }
}

