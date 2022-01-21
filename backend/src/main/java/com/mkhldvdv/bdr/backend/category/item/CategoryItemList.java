package com.mkhldvdv.bdr.backend.category.item;

import java.util.List;

import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryItemList extends MongoItemList<CategoryItem> {

    private List<String> categoryIdList;
    private List<CategoryItem> categoryList;

    @Override
    public List<String> ids() {
        return categoryIdList;
    }

    @Override
    public List<CategoryItem> items() {
        return categoryList;
    }
}
