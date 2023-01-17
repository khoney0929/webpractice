package com.example.webpractice.repository;

import com.example.webpractice.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BoardRepository extends JpaRepository<Board, Integer> {

}
