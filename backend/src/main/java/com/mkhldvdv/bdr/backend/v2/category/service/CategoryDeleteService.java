package com.mkhldvdv.bdr.backend.v2.category.service;

import com.mkhldvdv.bdr.backend.v2.category.CategoryItem;
import com.mkhldvdv.bdr.backend.v2.category.CategoryRepository;
import com.mkhldvdv.bdr.backend.v2.common.service.AbstractDeleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryDeleteService extends AbstractDeleteService<CategoryItem, CategoryRepository> {

    public CategoryDeleteService(CategoryRepository repository) {
        super(repository);
    }

}
