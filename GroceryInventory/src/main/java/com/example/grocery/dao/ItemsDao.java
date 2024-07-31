package com.example.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.grocery.entity.ItemsEntity;

public interface ItemsDao extends JpaRepository<ItemsEntity, Long>{

}
