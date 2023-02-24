package com.laundrycorporation.projectzero.repository;

import com.laundrycorporation.projectzero.model.ProfileDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileRepository {
    public List<ProfileDTO> findAll(){
        List<ProfileDTO> profiles = new ArrayList<>();
        profiles.add(ProfileDTO.builder().firstName("Rojan").lastName("Maharjan").age(26).budget(2000L).location("30350").build());
        profiles.add(ProfileDTO.builder().firstName("Sanij").lastName("Shakya").age(29).budget(1500L).location("30030").build());
        profiles.add(ProfileDTO.builder().firstName("Bijay").lastName("Sedhain").age(26).budget(2000L).location("30101").build());
        profiles.add(ProfileDTO.builder().firstName("Anup").lastName("Sharma").age(26).budget(2000L).location("30350").build());
        return profiles;
    }
}
