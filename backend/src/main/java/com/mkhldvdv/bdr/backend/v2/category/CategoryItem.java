package com.mkhldvdv.bdr.backend.v2.category;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

import static com.mkhldvdv.bdr.backend.v2.common.Constants.CATEGORY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document("categories")
public class CategoryItem extends MongoItem {

    @MongoId
    private String categoryId = UUID.randomUUID().toString();
    @NotBlank
    private String userId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;

    @Override
    public String getItemId() {
        return getCategoryId();
    }

    @Override
    public String getItemName() {
        return CATEGORY;
    }

}
