package com.shuai.twitter.api.dao;

import com.shuai.twitter.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin(origins = "http://localhost:4200")
public interface UserDao extends JpaRepository<User, Long> {
}


