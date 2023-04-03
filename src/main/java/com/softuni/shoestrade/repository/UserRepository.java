package com.softuni.shoestrade.repository;

import com.softuni.shoestrade.model.Comment;
import com.softuni.shoestrade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
