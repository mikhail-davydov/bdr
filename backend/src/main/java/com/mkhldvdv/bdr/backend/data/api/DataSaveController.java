package com.mkhldvdv.bdr.backend.data.api;

import com.mkhldvdv.bdr.backend.common.api.AbstractSaveController;
import com.mkhldvdv.bdr.backend.data.DataItem;
import com.mkhldvdv.bdr.backend.data.service.DataSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/data", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class DataSaveController extends AbstractSaveController<DataItem, DataSaveService> {

    public DataSaveController(DataSaveService service) {
        super(service);
    }

}
