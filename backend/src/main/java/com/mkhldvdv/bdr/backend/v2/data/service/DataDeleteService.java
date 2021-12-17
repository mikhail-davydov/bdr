package com.mkhldvdv.bdr.backend.v2.data.service;

import com.mkhldvdv.bdr.backend.v2.common.service.AbstractDeleteService;
import com.mkhldvdv.bdr.backend.v2.data.DataItem;
import com.mkhldvdv.bdr.backend.v2.data.DataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataDeleteService extends AbstractDeleteService<DataItem, DataRepository> {

    public DataDeleteService(DataRepository repository) {
        super(repository);
    }

}
