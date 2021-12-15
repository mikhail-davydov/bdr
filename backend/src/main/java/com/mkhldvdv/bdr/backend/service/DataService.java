package com.mkhldvdv.bdr.backend.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.dao.DataRepository;
import com.mkhldvdv.bdr.backend.domain.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DataService {

    private final DataRepository dataRepository;

    // create
    public Data create(Data data) {
        log.info("Create Data: {}", data);
        return dataRepository.insert(data);
    }

    public List<Data> create(List<Data> dataList) {
        log.info("Create Data list: {}", dataList);
        return dataRepository.insert(dataList);
    }

    // delete
    public Data delete(Data data) {
        log.info("Delete Data: {}", data);
        dataRepository.delete(data);
        return data;
    }

    public Data deleteById(String dataId) {
        log.info("Delete Data by ID: {}", dataId);
        Optional<Data> data = dataRepository.findById(dataId);
        data.ifPresent(value -> dataRepository.deleteById(dataId));
        return data.orElseGet(() -> {
            log.info("No Data record with ID: {}", dataId);
            return null;
        });
    }

    public List<String> deleteAllById(List<String> dataIdList) {
        log.info("Delete Data list by IDs: {}", dataIdList);
        List<String> dataIdListToDelete = Lists.newArrayList(dataRepository.findAllById(dataIdList)).stream()
                .map(Data::getDataId)
                .toList();
        dataRepository.deleteAllById(dataIdListToDelete);
        List<String> dataIdListNotDeleted = Lists.newArrayList(dataIdList);
        dataIdListNotDeleted.removeAll(dataIdListToDelete);
        if (dataIdListNotDeleted.isEmpty()) {
            return dataIdList;
        }
        log.info("No Data list IDs: {}", dataIdListNotDeleted);
        return dataIdListToDelete;
    }

}
