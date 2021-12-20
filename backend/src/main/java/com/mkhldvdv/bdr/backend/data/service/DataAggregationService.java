package com.mkhldvdv.bdr.backend.data.service;

import com.mkhldvdv.bdr.backend.data.dao.DataAggregationRepository;
import com.mkhldvdv.bdr.backend.data.item.DataItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DataAggregationService {

    private final DataAggregationRepository dataAggregationRepository;

    public List<DataItem> getAllItems() {
        return dataAggregationRepository.getAllItems();
    }

}
