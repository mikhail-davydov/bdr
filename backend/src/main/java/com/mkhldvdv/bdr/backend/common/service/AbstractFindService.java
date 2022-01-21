package com.mkhldvdv.bdr.backend.common.service;

import java.util.List;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ITEM_ID_LIST_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_FIND_ITEM_ID_TEMPLATE;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractFindService<I extends MongoItem, R extends MongoRepository<I, String>> implements IAbstractFindService<I> {

    private final R repository;

    @Override
    public I findItemById(String itemId) {
        log.info(LOG_FIND_ITEM_ID_TEMPLATE, itemId);
        return repository.findById(itemId).orElse(null);
    }

    @Override
    public List<I> findAllById(List<String> itemIdList) {
        log.info(LOG_FIND_ITEM_ID_LIST_TEMPLATE, itemIdList);
        return Lists.newArrayList(repository.findAllById(itemIdList)).stream().toList();
    }

    @Override
    public List<I> findAll(String itemName) {
        log.info("Find all {} items", itemName);
        return repository.findAll();
    }

    @Override
    public abstract List<I> findAll();

}
