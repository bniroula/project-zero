package com.laundrycorporation.projectzero.repository;

import com.laundrycorporation.projectzero.model.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileRepository {
    public List<Profile> findAll(){
        List<Profile> profiles = new ArrayList<>();
        profiles.add(Profile.builder().firstName("Rojan").lastName("Maharjan").age(26).budget(2000L).location("30350").build());
        profiles.add(Profile.builder().firstName("Sanij").lastName("Shakya").age(29).budget(1500L).location("30030").build());
        profiles.add(Profile.builder().firstName("Bijay").lastName("Sedhain").age(26).budget(2000L).location("30101").build());
        profiles.add(Profile.builder().firstName("Anup").lastName("Sharma").age(26).budget(2000L).location("30350").build());
        return profiles;
    }
}
