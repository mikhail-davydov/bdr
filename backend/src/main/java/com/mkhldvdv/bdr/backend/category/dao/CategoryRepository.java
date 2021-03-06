package com.mkhldvdv.bdr.backend.category.dao;

import com.mkhldvdv.bdr.backend.category.item.CategoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryItem, String> {
}
