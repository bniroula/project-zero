package com.laundrycorporation.projectzero.controller;

import com.laundrycorporation.projectzero.model.Entity.TempFeed;
import com.laundrycorporation.projectzero.model.Response.ProfileResponse;
import com.laundrycorporation.projectzero.repository.ProfileRepository;
import com.laundrycorporation.projectzero.service.FeedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private FeedService feedService;

    @GetMapping("/feed")
    public ResponseEntity<List<ProfileResponse>> findAlLProfiles() {
        try {
            List<ProfileResponse> profiles = profileRepository.findAll();

            if (profiles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(profiles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/feed-temp")
    public ResponseEntity<List<TempFeed>> findTempProfiles() {
       return new ResponseEntity<>(feedService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/feed-temp")
    public ResponseEntity<List<TempFeed>> postTempProfiles(@RequestBody List<TempFeed> feedList) {
        return new ResponseEntity<>(feedService.saveAll(feedList), HttpStatus.OK);
    }

    public static Logger LOG = LoggerFactory.getLogger(FeedController.class);
}
