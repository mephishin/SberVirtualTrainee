package org.example;

import java.util.Comparator;

public class DistrictNameComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        if (o1.getDistrict().compareTo(o2.getDistrict()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        else {
            return o1.getDistrict().compareTo(o2.getDistrict());
        }
    }
}