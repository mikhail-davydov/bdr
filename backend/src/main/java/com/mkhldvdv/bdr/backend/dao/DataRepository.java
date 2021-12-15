package com.mkhldvdv.bdr.backend.dao;

import com.mkhldvdv.bdr.backend.domain.DataRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataRecord, String> {
}
