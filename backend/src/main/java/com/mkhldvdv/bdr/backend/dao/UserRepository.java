package com.mkhldvdv.bdr.backend.dao;

import com.mkhldvdv.bdr.backend.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
