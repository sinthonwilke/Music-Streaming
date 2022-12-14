package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.containerPlaylistEntity;
import com.example.demo.Repository.containerPlaylistRepository;

@Service
public class containerPlaylistService {
    
    @Autowired
    private containerPlaylistRepository repo;

    public List<containerPlaylistEntity> findAll() {
        return (List<containerPlaylistEntity>) repo.findByOrderByPlaylistAsc();
    }

    public List<containerPlaylistEntity> findByPlaylistId(Long id) {
        return (List<containerPlaylistEntity>) repo.findByPlaylistId(id);
    }

    public void save(containerPlaylistEntity containerPlaylist) {
        repo.save(containerPlaylist);
    }

    public void deleteByUserIdAndMusicId(Long playlistId, Long musicId) {
        repo.deleteByPlaylistIdAndMusicId(playlistId, musicId);
    }
}
