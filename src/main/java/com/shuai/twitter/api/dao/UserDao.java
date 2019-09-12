package com.shuai.twitter.api.dao;

import com.shuai.twitter.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
