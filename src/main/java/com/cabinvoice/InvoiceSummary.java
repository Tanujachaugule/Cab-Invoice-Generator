package com.cabinvoice;

public class InvoiceSummary {
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        InvoiceSummary that = (InvoiceSummary) o;
//        return numberOfRides == that.numberOfRides && Double.compare(that.totalFare, totalFare) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }

    int numberOfRides;
    double totalFare;

    public InvoiceSummary(int numberOfRides, double totalFare){
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;

    }
}
