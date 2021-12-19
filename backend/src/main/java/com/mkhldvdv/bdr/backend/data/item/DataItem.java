package com.mkhldvdv.bdr.backend.data.item;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static com.mkhldvdv.bdr.backend.common.Constants.DATA;
import static com.mkhldvdv.bdr.backend.common.Constants.ITEM_ID_TEMPLATE;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "data")
public class DataItem extends MongoItem {

    @MongoId(FieldType.STRING)
    private String dataId = String.format(ITEM_ID_TEMPLATE, DATA, UUID.randomUUID());
    @NotBlank
    private String userId;
    @NotBlank
    private String categoryId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;
    private String parentCategoryDescription;
    @NotNull
    private BigDecimal amount;
    private int priority;
    private Date createdAt = new Date();
    private boolean deleted;

    @Override
    public String itemId() {
        return getDataId();
    }

    @Override
    public void setDeletedFlag() {
        setDeleted(true);
    }
}
