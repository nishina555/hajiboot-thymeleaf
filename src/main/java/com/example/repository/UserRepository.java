package com.example.repository;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nishina on 2016/09/24.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
