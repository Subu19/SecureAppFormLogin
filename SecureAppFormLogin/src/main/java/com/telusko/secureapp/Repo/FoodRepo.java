package com.telusko.secureapp.Repo;

import com.telusko.secureapp.Entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepo extends JpaRepository<Food,Long> {
    @Query("SELECT f FROM Food f WHERE f.name LIKE %:name%")
    List<Food> searchByName(@Param("name") String name);

}
