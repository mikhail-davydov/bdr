package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.CategoryRecord;
import com.mkhldvdv.bdr.backend.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    // create / update
    @PostMapping(path = "/category")
    public CategoryRecord createOrUpdate(@RequestBody @Valid CategoryRecord category) {
        log.info("Category: {}", category);
        return categoryService.createOrUpdate(category);
    }

    @PostMapping(path = "/category/list")
    public List<CategoryRecord> createOrUpdate(@RequestBody @Valid List<CategoryRecord> categoryList) {
        log.info("Category list: {}", categoryList);
        return categoryService.createOrUpdate(categoryList);
    }

    // delete
    @DeleteMapping(path = "/category")
    public CategoryRecord delete(@RequestBody @Valid CategoryRecord category) {
        log.info("Category: {}", category);
        return categoryService.delete(category);
    }

    @DeleteMapping(path = "/category/{categoryId}")
    public CategoryRecord deleteById(@PathVariable String categoryId) {
        log.info("CategoryId: {}", categoryId);
        return categoryService.deleteById(categoryId);
    }

    @DeleteMapping(path = "/category/list")
    public List<String> deleteAllById(@RequestBody List<String> categoryIdList) {
        log.info("CategoryId list: {}", categoryIdList);
        return categoryService.deleteAllById(categoryIdList);
    }

}
