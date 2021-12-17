package com.mkhldvdv.bdr.backend.v2.category.service;

import com.mkhldvdv.bdr.backend.v2.category.CategoryItem;
import com.mkhldvdv.bdr.backend.v2.category.CategoryRepository;
import com.mkhldvdv.bdr.backend.v2.common.service.AbstractSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategorySaveService extends AbstractSaveService<CategoryItem, CategoryRepository> {

    public CategorySaveService(CategoryRepository repository) {
        super(repository);
    }

}
