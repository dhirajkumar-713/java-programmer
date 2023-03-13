/* This Program is created by Dhirajkumar Jaiswal.
 If you have any doubt you can reach me at my Instagram ID: dhirajkumar713*/
package com.java.basics.compatator;

import com.java.basics.comparable.Movie;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.getRating()< m2.getRating()){return -1;}
        if(m1.getRating()> m2.getRating()){return 1;}
        return 0;
    }
}
