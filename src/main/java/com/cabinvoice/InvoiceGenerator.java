package com.cabinvoice;

public class InvoiceGenerator {
    private static final int costPerTime = 1;
    private static final double minimumCostPerKilometer = 10.0;
    private static final double minimumFare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * minimumCostPerKilometer + time * costPerTime;
        return Math.max(totalFare, minimumFare);
    }

    public double calculateFare(CalculateFare[] rides) {
        double totalFare = 0;
        for (CalculateFare ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
            System.out.println("totalFare" + totalFare);
        }
        return totalFare;
    }
}