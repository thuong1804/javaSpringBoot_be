package com.example.be_taskmaster.modules.user;

import com.example.be_taskmaster.modules.user.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Boolean existsByName(String name);
    Boolean existsByPhone(Integer phone);
}

