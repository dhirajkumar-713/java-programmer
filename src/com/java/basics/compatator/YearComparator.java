/* This Program is created by Dhirajkumar Jaiswal.
 If you have any doubt you can reach me at my Instagram ID: dhirajkumar713*/
package com.java.basics.compatator;

import com.java.basics.comparable.Movie;

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getYear() < m2.getYear()) {
            return -1;
        }
        if (m1.getYear() > m2.getYear()) {
            return 1;
        }
        return 0;
    }
}
