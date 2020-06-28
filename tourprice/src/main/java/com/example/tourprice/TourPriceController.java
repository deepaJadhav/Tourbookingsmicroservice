package com.example.tourprice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourPriceController {
    @GetMapping("/tourprice/{tourname}/")
    public int getPriceForBooking
            (@PathVariable String tourname)
    {
        if(tourname.equalsIgnoreCase("short"))
        return 100;
        else if(tourname.equalsIgnoreCase("long"))
        return 200;
         return 0;
    }
}
