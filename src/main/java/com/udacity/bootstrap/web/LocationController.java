package com.udacity.bootstrap.web;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLOcations(){
        return new ResponseEntity<>(locationService.retrieveLocations(), HttpStatus.OK);
    }
}
