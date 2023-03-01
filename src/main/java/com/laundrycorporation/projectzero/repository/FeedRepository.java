package com.laundrycorporation.projectzero.repository;

import com.laundrycorporation.projectzero.model.Entity.TempFeed;
import com.laundrycorporation.projectzero.model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FeedRepository extends JpaRepository<TempFeed, UUID> {
}
