package com.mkhldvdv.bdr.backend.user;

import com.mkhldvdv.bdr.backend.user.item.UserItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserItem, String> {
}
