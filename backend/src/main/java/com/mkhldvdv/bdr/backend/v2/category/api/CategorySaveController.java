package com.mkhldvdv.bdr.backend.v2.category.api;

import com.mkhldvdv.bdr.backend.v2.category.CategoryItem;
import com.mkhldvdv.bdr.backend.v2.category.service.CategorySaveService;
import com.mkhldvdv.bdr.backend.v2.common.api.AbstractSaveController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class CategorySaveController extends AbstractSaveController<CategoryItem, CategorySaveService> {

    public CategorySaveController(CategorySaveService service) {
        super(service);
    }

}
