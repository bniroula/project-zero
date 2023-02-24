package com.laundrycorporation.projectzero.controller;

import com.laundrycorporation.projectzero.model.Profile;
import com.laundrycorporation.projectzero.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FeedController {

    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/feed")
    public ResponseEntity<List<Profile>> findAlLProfiles() {
        try {
            List<Profile> profiles = profileRepository.findAll();

            if (profiles.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(profiles, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
