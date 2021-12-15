package com.mkhldvdv.bdr.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Data {

    @MongoId
    private String dataId;

}
