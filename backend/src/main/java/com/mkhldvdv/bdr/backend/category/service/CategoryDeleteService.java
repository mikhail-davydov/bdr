package com.mkhldvdv.bdr.backend.category.service;

import com.mkhldvdv.bdr.backend.category.dao.CategoryRepository;
import com.mkhldvdv.bdr.backend.category.item.CategoryItem;
import com.mkhldvdv.bdr.backend.common.service.AbstractDeleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryDeleteService extends AbstractDeleteService<CategoryItem, CategoryRepository> {

    public CategoryDeleteService(CategoryRepository repository) {
        super(repository);
    }

}
