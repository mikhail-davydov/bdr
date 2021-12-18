package com.mkhldvdv.bdr.backend.category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryItem, String> {
}
