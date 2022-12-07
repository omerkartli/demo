package com.example.demo.repository;


import com.example.demo.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder,Long> {
}
