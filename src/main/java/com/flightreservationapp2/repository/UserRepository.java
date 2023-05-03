package com.flightreservationapp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservationapp2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

User findByEmail(String emailid);

}
