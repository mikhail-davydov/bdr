package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.DataRecord;
import com.mkhldvdv.bdr.backend.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class DataController {

    private final DataService dataService;

    // create / update
    @PostMapping(path = "/data")
    public DataRecord createOrUpdate(@RequestBody @Valid DataRecord data) {
        log.info("Data: {}", data);
        return dataService.createOrUpdate(data);
    }

    @PostMapping(path = "/data/list")
    public List<DataRecord> createOrUpdate(@RequestBody @Valid List<DataRecord> dataList) {
        log.info("Data list: {}", dataList);
        return dataService.createOrUpdate(dataList);
    }

    // delete
    @DeleteMapping(path = "/data")
    public DataRecord delete(@RequestBody @Valid DataRecord data) {
        log.info("Data: {}", data);
        return dataService.delete(data);
    }

    @DeleteMapping(path = "/data/{dataId}")
    public DataRecord deleteById(@PathVariable String dataId) {
        log.info("DataId: {}", dataId);
        return dataService.deleteById(dataId);
    }

    @DeleteMapping(path = "/data/list")
    public List<String> deleteAllById(@RequestBody List<String> dataIdList) {
        log.info("DataId list: {}", dataIdList);
        return dataService.deleteAllById(dataIdList);
    }

}
