package com.mkhldvdv.bdr.backend.v2.data;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static com.mkhldvdv.bdr.backend.v2.common.Constants.DATA;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "data")
public class DataItem extends MongoItem {

    @MongoId(FieldType.STRING)
    private String dataId = UUID.randomUUID().toString();
    @NotBlank
    private String userId;
    @NotBlank
    private String categoryId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;
    private String parentCategoryDescription;
    @NotBlank
    private BigDecimal amount;
    private int priority;
    private Date date = new Date();

    @Override
    public String getItemId() {
        return getDataId();
    }

    @Override
    public String getItemName() {
        return DATA;
    }

}
