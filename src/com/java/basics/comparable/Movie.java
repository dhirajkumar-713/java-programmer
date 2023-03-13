/* This Program is created by Dhirajkumar Jaiswal.
 If you have any doubt you can reach me at my Instagram ID: dhirajkumar713
 Adding the git ID deatils : dgirajkumar-713
 */
package com.java.basics.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

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
        System.out.println("After Sorting");
        for (Movie movie :
                list) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());

        }
    }
}
