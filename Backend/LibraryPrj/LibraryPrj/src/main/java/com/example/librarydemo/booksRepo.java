package com.example.librarydemo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface  booksRepo extends JpaRepository<books,Integer> {}
