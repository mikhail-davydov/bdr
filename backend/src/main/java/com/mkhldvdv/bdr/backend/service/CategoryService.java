package com.mkhldvdv.bdr.backend.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.dao.CategoryRepository;
import com.mkhldvdv.bdr.backend.domain.CategoryRecord;
import com.mkhldvdv.bdr.backend.domain.DataRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // create / update
    public CategoryRecord createOrUpdate(CategoryRecord category) {
        log.info("Create Category: {}", category);
        return categoryRepository.save(category);
    }

    public List<CategoryRecord> createOrUpdate(List<CategoryRecord> categoryList) {
        log.info("Create Category list: {}", categoryList);
        return categoryRepository.saveAll(categoryList);
    }

    // delete
    public CategoryRecord delete(CategoryRecord category) {
        log.info("Delete Category: {}", category);
        categoryRepository.delete(category);
        return category;
    }

    public CategoryRecord deleteById(String categoryId) {
        log.info("Delete Category by ID: {}", categoryId);
        Optional<CategoryRecord> category = categoryRepository.findById(categoryId);
        category.ifPresent(value -> categoryRepository.deleteById(categoryId));
        return category.orElseGet(() -> {
            log.info("No Category record with ID: {}", categoryId);
            return null;
        });
    }

    public List<String> deleteAllById(List<String> categoryIdList) {
        log.info("Delete Category list by IDs: {}", categoryIdList);
        List<String> categoryIdListToDelete = Lists.newArrayList(categoryRepository.findAllById(categoryIdList)).stream()
                .map(CategoryRecord::getCategoryId)
                .toList();
        categoryRepository.deleteAllById(categoryIdListToDelete);
        List<String> categoryIdListNotDeleted = Lists.newArrayList(categoryIdList);
        categoryIdListNotDeleted.removeAll(categoryIdListToDelete);
        if (categoryIdListNotDeleted.isEmpty()) {
            return categoryIdList;
        }
        log.info("No Category list IDs: {}", categoryIdListNotDeleted);
        return categoryIdListToDelete;
    }

}
