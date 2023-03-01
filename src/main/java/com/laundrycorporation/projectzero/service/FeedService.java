package com.laundrycorporation.projectzero.service;

import com.laundrycorporation.projectzero.model.Entity.TempFeed;
import com.laundrycorporation.projectzero.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedService {

    @Autowired
    FeedRepository feedRepository;

    public List<TempFeed> saveAll(List<TempFeed> feedList){
        return feedRepository.saveAll(feedList);
    }

    public List<TempFeed> getAll() {
        return feedRepository.findAll();
    }
}
