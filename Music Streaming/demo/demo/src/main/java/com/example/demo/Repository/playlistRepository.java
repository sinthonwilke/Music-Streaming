package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.playlistEntity;

@Repository
public interface playlistRepository extends CrudRepository<playlistEntity, Long> {

    List<playlistEntity> findByUserId(Long id);

}
