package com.mkhldvdv.bdr.backend.data.dao;

import com.mkhldvdv.bdr.backend.data.item.DataItem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface DataRepository extends MongoRepository<DataItem, String> {

    List<DataItem> findAllByUserIdAndCreatedAtBetweenAndDeleted(String userId,
                                                                Date startDate,
                                                                Date endDate,
                                                                boolean deleted);

    List<DataItem> findAllByUserIdAndParentCategoryIdAndDeleted(String userId,
                                                                String categoryId,
                                                                boolean deleted);

    List<DataItem> findAllByUserIdAndCategoryIdAndCreatedAtBetweenAndDeleted(String userId,
                                                                             String categoryId,
                                                                             Date startDate,
                                                                             Date endDate,
                                                                             boolean deleted);

}
