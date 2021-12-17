package com.mkhldvdv.bdr.backend.v2.category.api;

import com.mkhldvdv.bdr.backend.v2.category.CategoryItem;
import com.mkhldvdv.bdr.backend.v2.category.service.CategoryDeleteService;
import com.mkhldvdv.bdr.backend.v2.common.api.AbstractDeleteController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class CategoryDeleteController extends AbstractDeleteController<CategoryItem, CategoryDeleteService> {

    public CategoryDeleteController(CategoryDeleteService service) {
        super(service);
    }

}
