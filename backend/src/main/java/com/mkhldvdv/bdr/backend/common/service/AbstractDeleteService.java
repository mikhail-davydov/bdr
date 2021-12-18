package com.mkhldvdv.bdr.backend.common.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.common.Constants;
import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractDeleteService<I extends MongoItem, R extends MongoRepository<I, String>> implements IAbstractDeleteService<I> {

    private final R repository;

    @Override
    public I delete(I item) {
        log.info(Constants.LOG_DELETE_ITEM_TEMPLATE, item);
        repository.delete(item);
        return item;
    }

    @Override
    public I deleteById(String itemId) {
        log.info(Constants.LOG_DELETE_ITEM_ID_TEMPLATE, itemId);
        Optional<I> data = repository.findById(itemId);
        data.ifPresent(value -> repository.deleteById(itemId));
        return data.orElseGet(() -> {
            log.info(Constants.LOG_NO_ITEM_ID_TEMPLATE, itemId);
            return null;
        });
    }

    @Override
    public List<String> deleteAllById(List<String> itemIdList) {
        log.info(Constants.LOG_DELETE_ITEM_ID_LIST_TEMPLATE, itemIdList);
        List<String> itemIdListToDelete = Lists.newArrayList(repository.findAllById(itemIdList)).stream()
                .map(I::itemId)
                .toList();
        repository.deleteAllById(itemIdListToDelete);
        List<String> itemIdListNotDeleted = Lists.newArrayList(itemIdList);
        itemIdListNotDeleted.removeAll(itemIdListToDelete);
        if (itemIdListNotDeleted.isEmpty()) {
            return itemIdList;
        }
        log.info(Constants.LOG_NO_ITEM_ID_LIST_TEMPLATE, itemIdListNotDeleted);
        return itemIdListToDelete;
    }

}
