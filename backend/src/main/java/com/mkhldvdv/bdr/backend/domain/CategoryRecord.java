package com.mkhldvdv.bdr.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("categories")
public class CategoryRecord {

    @MongoId
    private String categoryId = UUID.randomUUID().toString();
    @NotBlank
    private String userId;
    @NotBlank
    private String categoryDescription;
    private String parentCategoryId;

}
