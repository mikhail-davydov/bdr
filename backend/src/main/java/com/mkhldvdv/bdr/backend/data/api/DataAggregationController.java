package com.mkhldvdv.bdr.backend.data.api;

import com.mkhldvdv.bdr.backend.data.item.DataItem;
import com.mkhldvdv.bdr.backend.data.service.DataAggregationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/data", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class DataAggregationController {

    private final DataAggregationService dataAggregationService;

    @GetMapping
    public List<DataItem> getAllItems() {
        log.info("Get all Data items");
        return dataAggregationService.getAllItems();
    }

}
