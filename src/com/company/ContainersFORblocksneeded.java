package com.company;

public class ContainersFORblocksneeded {
    public static void main(String[] args) {
        //odd numbers of legos we have
        int amountOfBricks = 77 ;

        // even number of legos that fit in one container
        int containerCapacity = 8 ;

        //Calculation of how many containers not full

        int containersUnfilled = amountOfBricks% containerCapacity ;
        System.out.println("The number of unfilled containers will be" + containersUnfilled);

        //Filled containers
        int filledContainers = amountOfBricks / containerCapacity ;
        System.out.println("NUmber of filled containers :" + filledContainers);

        //the amount of containers both full and not full
        System.out.println(" ");
        int totalContainers = filledContainers + containersUnfilled ;
        System.out.println("Number of containers in total are " + totalContainers);
    }
}
