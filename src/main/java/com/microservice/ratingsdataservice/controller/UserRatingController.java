/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microservice.ratingsdataservice.controller;

import com.microservice.ratingsdataservice.model.UserRating;
import com.microservice.ratingsdataservice.model.UserRatingResponseBean;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */

@RestController
@RequestMapping("/user-rating")
public class UserRatingController {
    
    @GetMapping("/fetchUserRating/{userId}")
    public UserRatingResponseBean fetchUserRatingDetails(@PathVariable("userId") String userId) {
        System.out.println("fetchUserRatingDetails userId "+userId);
        return new UserRatingResponseBean();
    }
    
    @GetMapping("/fetchUserRatingList/{userId}")
    public ResponseEntity<List<UserRating>> fetchUserRatingDetailsList(@PathVariable("userId") String userId) {
        System.out.println("fetchUserRatingDetails userId "+userId);
        return new ResponseEntity(new ArrayList<UserRating>(), HttpStatus.OK);
    }
}
