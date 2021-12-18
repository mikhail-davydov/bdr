package com.mkhldvdv.bdr.backend.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataItem, String> {
}
