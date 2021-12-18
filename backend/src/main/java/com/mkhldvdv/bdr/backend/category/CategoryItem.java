package com.mkhldvdv.bdr.backend.category;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

import static com.mkhldvdv.bdr.backend.common.Constants.CATEGORY;
import static com.mkhldvdv.bdr.backend.common.Constants.ITEM_ID_TEMPLATE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document("categories")
public class CategoryItem extends MongoItem {

    @MongoId
    private String categoryId = String.format(ITEM_ID_TEMPLATE, CATEGORY, UUID.randomUUID());
    @NotBlank
    private String userId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;

    @Override
    public String itemId() {
        return getCategoryId();
    }

}
