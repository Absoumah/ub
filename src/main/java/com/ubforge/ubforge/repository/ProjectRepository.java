package com.ubforge.ubforge.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.ubforge.ubforge.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> { 

}
