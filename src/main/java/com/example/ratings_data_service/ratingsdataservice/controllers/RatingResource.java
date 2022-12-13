package com.example.ratings_data_service.ratingsdataservice.controllers;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratings_data_service.ratingsdataservice.models.Rating;
import com.example.ratings_data_service.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
    
    @GetMapping("/movie/{movieid}")
    public List<Rating> getallratings(@PathVariable String movieid){
        System.out.println("in ratings get mthod");
        return Arrays.asList(new Rating(movieid,3),new Rating(movieid,7),new Rating(movieid,5));
    }

    @GetMapping("/user/{userid}")
    public UserRating getUserRating(@PathVariable String userid){
        System.out.println("in user ratings get mthod");
        UserRating ur=new UserRating(); 
        ur.initializeData(userid);
        return ur;
    }
}
