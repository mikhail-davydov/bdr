package com.mkhldvdv.bdr.backend.category.service;

import java.util.List;

import com.mkhldvdv.bdr.backend.category.dao.CategoryRepository;
import com.mkhldvdv.bdr.backend.category.item.CategoryItem;
import com.mkhldvdv.bdr.backend.common.service.AbstractFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.mkhldvdv.bdr.backend.common.Constants.CATEGORY;

@Service
@Slf4j
public class CategoryFindService extends AbstractFindService<CategoryItem, CategoryRepository> {

    public CategoryFindService(CategoryRepository repository) {
        super(repository);
    }

    @Override
    public List<CategoryItem> findAll() {
        return findAll(CATEGORY);
    }
}
