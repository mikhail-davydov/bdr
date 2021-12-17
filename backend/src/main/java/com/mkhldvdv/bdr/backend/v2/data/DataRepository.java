package com.mkhldvdv.bdr.backend.v2.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataItem, String> {
}
