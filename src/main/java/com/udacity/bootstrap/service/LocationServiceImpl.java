package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.repoistory.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}
