package com.briz.cabinvoicegenerator;

import model.InvoiceSummary;
import model.Ride;
import org.junit.Assert;
import org.junit.Test;
import service.InvoiceService;

public class CabInvoiceServiceTest {
    @Test
    public void givenDistanceAndTime_whenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(2.0, 5);
        Assert.assertEquals(25, totalFare, 0.0);
    }

    @Test
    public void givenDistanceAndTimeTestCase2_whenCalculateFare_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(1.0, 5);
        Assert.assertEquals(15, totalFare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_whenCalculateFareIsLessThan5_ShouldReturnTotalFareAs5() {
        InvoiceService invoiceService = new InvoiceService();
        double totalFare = invoiceService.calculateFare(0.1, 1);
        Assert.assertEquals(5, totalFare, 0.0);
    }

    @Test
    public void givenAUserId_TheInvoiceServiceGetsTheListOfRides_AndReturnsTheInvoice() {
        InvoiceService invoiceService = new InvoiceService();
        Ride[] rides = {new Ride(2.0, 10, "1"),
                new Ride(1.0, 10, "1")};
        InvoiceSummary expectedSummary = new InvoiceSummary("1", 50);
        InvoiceSummary summary = invoiceService.calculateNumberOfRides(rides, "1");
        Assert.assertEquals(expectedSummary, summary);
    }

}
