/* This Program is created by Dhirajkumar Jaiswal.
 If you have any doubt you can reach me at my Instagram ID: dhirajkumar713*/
package com.java.basics.compatator;

import com.java.basics.comparable.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie(2.2, "Movie One", 1991));
        list.add(new Movie(6.2, "Movie Two", 1987));
        list.add(new Movie(9.2, "Movie Three", 1999));
        list.add(new Movie(1.2, "Movie Four", 2009));
        for (Movie movie :
                list) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());

        }
        Collections.sort(list);
        System.out.println("After Comparing by Name");
        NameComparator nameComparator=new NameComparator();
        Collections.sort(list,nameComparator);
        for (Movie movie :
                list) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());

        }
        System.out.println("After Comparing by Rating");
        RatingComparator ratingComparator=new RatingComparator();
        Collections.sort(list,ratingComparator);
        for (Movie movie :
                list) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());

        }
        System.out.println("After Comparing by Year");
        YearComparator yearComparator=new YearComparator();
        Collections.sort(list,yearComparator);
        for (Movie movie :
                list) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());

        }
    }
}
