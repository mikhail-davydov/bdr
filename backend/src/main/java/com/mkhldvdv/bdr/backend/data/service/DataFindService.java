package com.mkhldvdv.bdr.backend.data.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractFindService;
import com.mkhldvdv.bdr.backend.data.DataRepository;
import com.mkhldvdv.bdr.backend.data.item.DataItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DataFindService extends AbstractFindService<DataItem, DataRepository> {

    public DataFindService(DataRepository repository) {
        super(repository);
    }

}
