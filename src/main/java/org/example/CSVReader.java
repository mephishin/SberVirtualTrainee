package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CSVReader {
    public List<City> readCSV(String name) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(name));

        String line;
        Scanner scanner;
        int index = 0;
        List<City> cityList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            City city = new City();
            scanner = new Scanner(line);
            scanner.useDelimiter(";");
            while (scanner.hasNext()) {
                String data = scanner.next();
                switch (index) {
                    case 0:
                        city.setId(Integer.parseInt(data));
                        break;
                    case 1:
                        city.setName(data);
                        break;
                    case 2:
                        city.setRegion(data);
                        break;
                    case 3:
                        city.setDistrict(data);
                        break;
                    case 4:
                        city.setPopulation(Integer.parseInt(data));
                    case 5:
                        city.setFoundation(data);
                        break;
                    default:
                        System.out.println("Ошибка!");
                        break;
                }
                index++;
            }
            index = 0;
            cityList.add(city);
        }
        reader.close();
        return cityList;
    }
}