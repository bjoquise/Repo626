package edu.xula.cssr;

import java.util.ArrayList;

// This program attempts to predict the winner of the 2018 World Cup
// TODO: 6/15/2018 add team names into an ArrayList
// TODO: 6/15/2018 pick random country from list
// TODO: 6/15/2018  get the top five countries after 1000 runs
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Insert world cup teams
        ArrayList<String> teamsList = new ArrayList<>();

        // Add countries to ArrayList
        teamsList.add("Argentina"); teamsList.add("Australia"); teamsList.add("Belgium");
        teamsList.add("Brazil"); teamsList.add("Colombia"); teamsList.add("Costa Rica");
        teamsList.add("Croatia"); teamsList.add("Denmark"); teamsList.add("Egypt");
        teamsList.add("England"); teamsList.add("France"); teamsList.add("Germany");
        teamsList.add("Iceland"); teamsList.add("Iran"); teamsList.add("Japan");
        teamsList.add("Korean Republic"); teamsList.add("Mexico"); teamsList.add("Morocco");
        teamsList.add("Nigeria"); teamsList.add("Panama"); teamsList.add("Peru");
        teamsList.add("Portland"); teamsList.add("Portugal"); teamsList.add("Russia");
        teamsList.add("Saudi Arabia"); teamsList.add("Senegal"); teamsList.add("Serbia");
        teamsList.add("Spain"); teamsList.add("Sweden"); teamsList.add("Switzerland");
        teamsList.add("Tunisia"); teamsList.add("Uruguay");
        System.out.println("The Teams: " + teamsList);

        System.out.println("first push - Lee-RoysDevelopment");



    }
}
