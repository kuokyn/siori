package com.siori_group.siori.repository;

import com.siori_group.siori.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
