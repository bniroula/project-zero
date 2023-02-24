package com.laundrycorporation.projectzero.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ProfileDTO {
    private Integer age;
    private Integer numberOfBath;
    private Integer numberOfBed;

    private Long budget;

    private String firstName;
    private String lastName;
    private String location;
    private String eatingHabits;
    private String religion;
    private String goal;

    private List<String> interests;
    private List<String> dynamicPreferences;
}
