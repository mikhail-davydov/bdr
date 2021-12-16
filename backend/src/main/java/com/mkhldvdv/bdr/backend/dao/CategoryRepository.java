package com.mkhldvdv.bdr.backend.dao;

import com.mkhldvdv.bdr.backend.domain.CategoryRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryRecord, String> {
}
