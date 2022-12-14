package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.favEntity;
import com.example.demo.Repository.favRepository;

@Service
public class favService {
    
    @Autowired
    private favRepository repo;

    public void save(favEntity fav) {
        repo.save(fav);
    }

    public List<favEntity> findAll() {
        return(List<favEntity>) repo.findAll();
    }

    public List<favEntity> findByUserId(Long id) {
        return(List<favEntity>) repo.findByUserId(id);
    }

    public List<favEntity> findByUserIdAndMusicId(Long user, Long music) {
        return(List<favEntity>) repo.findByUserIdAndMusicId(user, music);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void deleteByUserIdAndMusicId(Long user, Long music) {
        repo.deleteByUserIdAndMusicId(user, music);
    }
}
