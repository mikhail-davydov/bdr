package com.mkhldvdv.bdr.backend.data.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractDeleteService;
import com.mkhldvdv.bdr.backend.data.dao.DataRepository;
import com.mkhldvdv.bdr.backend.data.item.DataItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataDeleteService extends AbstractDeleteService<DataItem, DataRepository> {

    public DataDeleteService(DataRepository repository) {
        super(repository);
    }

}
