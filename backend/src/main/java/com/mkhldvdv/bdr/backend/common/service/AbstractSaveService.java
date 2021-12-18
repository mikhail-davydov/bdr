package com.mkhldvdv.bdr.backend.common.service;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_CREATE_ITEM_LIST_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_CREATE_ITEM_TEMPLATE;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSaveService<I extends MongoItem, R extends MongoRepository<I, String>> implements IAbstractSaveService<I> {

    private final R repository;

    @Override
    public I save(I item) {
        log.info(LOG_CREATE_ITEM_TEMPLATE, item);
        return repository.save(item);
    }

    @Override
    public List<I> save(List<I> itemList) {
        log.info(LOG_CREATE_ITEM_LIST_TEMPLATE, itemList);
        return repository.saveAll(itemList);
    }

}
