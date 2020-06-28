package com.example.tourbookings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    private BookingPriceProxy proxy;

    @GetMapping("/confirmbooking/{tourname}/to")
    public String confirmBookings
    (@PathVariable String tourname)
    {
        //return "confirmed";
        return "tourname"+tourname+" : "+String.valueOf(proxy.getPriceForBooking(tourname));
    }
}
