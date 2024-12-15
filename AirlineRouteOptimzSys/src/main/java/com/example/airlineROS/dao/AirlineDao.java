package com.example.airlineROS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.airlineROS.entity.AirlineEntity;

public interface AirlineDao extends JpaRepository<AirlineEntity,Long> {

	@Query("select a from AirlineEntity a where a.name like %:name%")
	AirlineEntity findByName(@Param("name") String name);
}
