package com.mkhldvdv.bdr.backend.category.service;

import com.mkhldvdv.bdr.backend.category.CategoryRepository;
import com.mkhldvdv.bdr.backend.category.item.CategoryItem;
import com.mkhldvdv.bdr.backend.common.service.AbstractSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategorySaveService extends AbstractSaveService<CategoryItem, CategoryRepository> {

    public CategorySaveService(CategoryRepository repository) {
        super(repository);
    }

}
