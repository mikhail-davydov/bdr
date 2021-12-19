package com.mkhldvdv.bdr.backend.data;

import com.mkhldvdv.bdr.backend.data.item.DataItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataRepository extends MongoRepository<DataItem, String> {
}
