package com.mkhldvdv.bdr.backend.data.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractSaveService;
import com.mkhldvdv.bdr.backend.data.DataItem;
import com.mkhldvdv.bdr.backend.data.DataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataSaveService extends AbstractSaveService<DataItem, DataRepository> {

    public DataSaveService(DataRepository repository) {
        super(repository);
    }

}
