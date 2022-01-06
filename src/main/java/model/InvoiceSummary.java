package model;

import java.util.Objects;

public class InvoiceSummary {
    private int numOfRides;
    private double totalFare;
    private double avgFare;
    private String id;

    public InvoiceSummary(String id, double totalFare) {
        this.numOfRides = 0;
        this.totalFare = totalFare;
        this.avgFare = 0;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
                && Objects.equals(avgFare, that.avgFare);
    }
}
