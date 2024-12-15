package com.example.airlineROS.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airlineROS.entity.Route;

public interface RouteDao extends JpaRepository<Route, Long> {

}
