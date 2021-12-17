package com.mkhldvdv.bdr.backend.v2.data.api;

import com.mkhldvdv.bdr.backend.v2.common.api.AbstractDeleteController;
import com.mkhldvdv.bdr.backend.v2.data.DataItem;
import com.mkhldvdv.bdr.backend.v2.data.service.DataDeleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class DataDeleteController extends AbstractDeleteController<DataItem, DataDeleteService> {

    public DataDeleteController(DataDeleteService service) {
        super(service);
    }

}
