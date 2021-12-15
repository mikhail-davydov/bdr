package com.mkhldvdv.bdr.backend.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.dao.DataRepository;
import com.mkhldvdv.bdr.backend.domain.DataRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DataService {

    private final DataRepository dataRepository;

    // create
    public DataRecord createOrUpdate(DataRecord data) {
        log.info("Create Data: {}", data);
        return dataRepository.save(data);
    }

    public List<DataRecord> createOrUpdate(List<DataRecord> dataList) {
        log.info("Create Data list: {}", dataList);
        return dataRepository.saveAll(dataList);
    }

    // delete
    public DataRecord delete(DataRecord data) {
        log.info("Delete Data: {}", data);
        dataRepository.delete(data);
        return data;
    }

    public DataRecord deleteById(String dataId) {
        log.info("Delete Data by ID: {}", dataId);
        Optional<DataRecord> data = dataRepository.findById(dataId);
        data.ifPresent(value -> dataRepository.deleteById(dataId));
        return data.orElseGet(() -> {
            log.info("No Data record with ID: {}", dataId);
            return null;
        });
    }

    public List<String> deleteAllById(List<String> dataIdList) {
        log.info("Delete Data list by IDs: {}", dataIdList);
        List<String> dataIdListToDelete = Lists.newArrayList(dataRepository.findAllById(dataIdList)).stream()
                .map(DataRecord::getDataId)
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
