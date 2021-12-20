package com.mkhldvdv.bdr.backend.data.dao;

import com.mkhldvdv.bdr.backend.data.item.DataItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import static com.mkhldvdv.bdr.backend.common.Constants.DATA;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

@Repository
@RequiredArgsConstructor
@Slf4j
public class DataAggregationRepository {

    private final MongoTemplate mongoTemplate;

    public List<DataItem> getAllItems() {
        // query
        MatchOperation matchOperation = match(new Criteria("createdAt").gte(new Date(1639847600000L)));

        // execution
        Aggregation aggregation = newAggregation(matchOperation);
        AggregationResults<DataItem> dataItems = mongoTemplate.aggregate(aggregation, DATA, DataItem.class);
        return dataItems.getMappedResults();
    }

}
