package com.mkhldvdv.bdr.backend.v2.category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryItem, String> {
}
