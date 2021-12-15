package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.Data;
import com.mkhldvdv.bdr.backend.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class DataController {

    private final DataService dataService;

    @PostMapping(path = "/data")
    public Data create(@RequestBody Data data) {
        log.info("Data: {}", data);
        return dataService.create(data);
    }

    @PostMapping(path = "/data/list")
    public List<Data> create(@RequestBody List<Data> dataList) {
        log.info("Data list: {}", dataList);
        return dataService.create(dataList);
    }

    @DeleteMapping(path = "/data")
    public Data delete(@RequestBody Data data) {
        log.info("Data: {}", data);
        return dataService.delete(data);
    }

    @DeleteMapping(path = "/data/{dataId}")
    public Data deleteById(@PathVariable String dataId) {
        log.info("DataId: {}", dataId);
        return dataService.deleteById(dataId);
    }

    @DeleteMapping(path = "/data/list/{dataIdList}")
    public List<String> deleteAllById(@PathVariable List<String> dataIdList) {
        log.info("DataId list: {}", dataIdList);
        return dataService.deleteAllById(dataIdList);
    }

}
