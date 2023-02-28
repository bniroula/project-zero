package com.laundrycorporation.projectzero.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "data")
public class User {

    @Id
    @GeneratedValue
    UUID id;
    String firstName;
    String lastName;
    ZonedDateTime dateOfBirth;
    String email;
    String phoneNumber;
    Boolean hasRoom;
    Boolean isVerified;
    ZonedDateTime dateJoined;
    ZonedDateTime availabilityStarting;
}
