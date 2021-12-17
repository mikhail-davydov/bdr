package com.mkhldvdv.bdr.backend.v2.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserItem, String> {
}
