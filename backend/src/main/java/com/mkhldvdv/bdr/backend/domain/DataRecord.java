package com.mkhldvdv.bdr.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "data")
public class DataRecord {

    @MongoId(FieldType.STRING)
    private String dataId = UUID.randomUUID().toString();
    @NotBlank
    private String userId;
    private String categoryId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;
    private String parentCategoryDescription;
    @NotBlank
    private BigDecimal amount;
    private int priority;
    private Date date = new Date();

}
