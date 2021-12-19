package com.mkhldvdv.bdr.backend.category.api;

import com.mkhldvdv.bdr.backend.category.item.CategoryItem;
import com.mkhldvdv.bdr.backend.category.item.CategoryItemList;
import com.mkhldvdv.bdr.backend.category.service.CategoryFindService;
import com.mkhldvdv.bdr.backend.common.api.AbstractFindController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/category", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class CategoryFindController extends AbstractFindController<CategoryItem, CategoryItemList, CategoryFindService> {

    public CategoryFindController(CategoryFindService service) {
        super(service);
    }

}
