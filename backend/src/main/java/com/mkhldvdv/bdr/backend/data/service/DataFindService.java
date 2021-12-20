package com.mkhldvdv.bdr.backend.data.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractFindService;
import com.mkhldvdv.bdr.backend.data.DataRepository;
import com.mkhldvdv.bdr.backend.data.item.DataItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.mkhldvdv.bdr.backend.common.Constants.NOT_DELETED;

@Service
@Slf4j
public class DataFindService extends AbstractFindService<DataItem, DataRepository> {

    private final DataRepository dataRepository;

    public DataFindService(DataRepository repository) {
        super(repository);
        this.dataRepository = repository;
    }

    public List<DataItem> findAllByUserAndDateBetween(String userId, Long startDateMillis, Long endDateMillis) {
        Date startDate = new Date(startDateMillis);
        Date endDate = new Date(endDateMillis);
        return dataRepository.findAllByUserIdAndCreatedAtBetweenAndDeleted(userId, startDate, endDate, NOT_DELETED);
    }

    public List<DataItem> findAllByUserAndCategory(String userId, String categoryId) {
        return dataRepository.findAllByUserIdAndParentCategoryIdAndDeleted(userId, categoryId, NOT_DELETED);
    }

    public List<DataItem> findAllByUserAndCategoryAndDateBetween(String userId,
                                                                 String categoryId,
                                                                 Long startDateMillis,
                                                                 Long endDateMillis) {
        Date startDate = new Date(startDateMillis);
        Date enddate = new Date(endDateMillis);
        return dataRepository.findAllByUserIdAndCategoryIdAndCreatedAtBetweenAndDeleted(userId, categoryId, startDate, enddate, NOT_DELETED);
    }

}
