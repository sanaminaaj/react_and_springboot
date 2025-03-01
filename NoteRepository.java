package com.example.notes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.notes.model.*;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	List<Note> findByOwnerUsername(String ownerusername);
}
