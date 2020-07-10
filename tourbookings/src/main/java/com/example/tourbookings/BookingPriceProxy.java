package com.example.tourbookings;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="zuulapigateway",url="192.168.99.100:8200")
//@RibbonClient(name="tourprice")
public interface BookingPriceProxy {
    @GetMapping("/tourprice/{tourname}/")
    public int getPriceForBooking
            (@PathVariable String tourname);

}
