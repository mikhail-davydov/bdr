package com.mkhldvdv.bdr.backend.data.api;

import com.mkhldvdv.bdr.backend.common.api.AbstractFindController;
import com.mkhldvdv.bdr.backend.data.item.DataItem;
import com.mkhldvdv.bdr.backend.data.item.DataItemList;
import com.mkhldvdv.bdr.backend.data.service.DataFindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ALL_DATA_BY_CATEGORY_AND_DATE_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ALL_DATA_BY_CATEGORY_AND_PERIOD_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ALL_DATA_BY_CATEGORY_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ALL_DATA_BY_DATE_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ALL_DATA_BY_PERIOD_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.ONE_DAY_SECONDS;

@RestController
@RequestMapping(path = "/api/data", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class DataFindController extends AbstractFindController<DataItem, DataItemList, DataFindService> {

    private final DataFindService dataFindService;

    public DataFindController(DataFindService service) {
        super(service);
        this.dataFindService = service;
    }

    @GetMapping(path = "/user/{userId}/date/{date}")
    public List<DataItem> findAllByUserAndDate(@PathVariable String userId, @PathVariable Long date) {
        log.info(LOG_FIND_ALL_DATA_BY_DATE_TEMPLATE, userId, date);
        return dataFindService.findAllByUserAndDateBetween(userId, date, date + ONE_DAY_SECONDS);
    }

    @GetMapping(path = "/user/{userId}/start/{startDate}/end/{endDate}")
    public List<DataItem> findAllByUserAndDateBetween(@PathVariable String userId,
                                                      @PathVariable Long startDate,
                                                      @PathVariable Long endDate) {
        log.info(LOG_FIND_ALL_DATA_BY_PERIOD_TEMPLATE, userId, startDate, endDate);
        return dataFindService.findAllByUserAndDateBetween(userId, startDate, endDate);
    }

    @GetMapping(path = "/user/{userId}/category/{categoryId}")
    public List<DataItem> findAllByUserAndCategory(@PathVariable String userId, @PathVariable String categoryId) {
        log.info(LOG_FIND_ALL_DATA_BY_CATEGORY_TEMPLATE, userId, categoryId);
        return dataFindService.findAllByUserAndCategory(userId, categoryId);
    }

    @GetMapping(path = "/user/{userId}/category/{categoryId}/date/{date}")
    public List<DataItem> findAllByUserAndCategoryAndDate(@PathVariable String userId,
                                                          @PathVariable String categoryId,
                                                          @PathVariable Long date) {
        log.info(LOG_FIND_ALL_DATA_BY_CATEGORY_AND_DATE_TEMPLATE, userId, categoryId, date);
        return dataFindService.findAllByUserAndCategoryAndDateBetween(userId, categoryId, date, date + ONE_DAY_SECONDS);
    }

    @GetMapping(path = "/user/{userId}/category/{categoryId}/start/{startDate}/end/{endDate}")
    public List<DataItem> findAllByUserAndCategoryAndDateBetween(@PathVariable String userId,
                                                                 @PathVariable String categoryId,
                                                                 @PathVariable Long startDate,
                                                                 @PathVariable Long endDate) {
        log.info(LOG_FIND_ALL_DATA_BY_CATEGORY_AND_PERIOD_TEMPLATE, userId, categoryId, startDate, endDate);
        return dataFindService.findAllByUserAndCategoryAndDateBetween(userId, categoryId, startDate, endDate);
    }

}
