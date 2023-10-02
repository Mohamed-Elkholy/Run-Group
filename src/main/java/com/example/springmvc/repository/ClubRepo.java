package com.example.springmvc.repository;

import com.example.springmvc.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepo extends JpaRepository<Club, Long> {

    Optional<Club> findByTitle(String title);
}
