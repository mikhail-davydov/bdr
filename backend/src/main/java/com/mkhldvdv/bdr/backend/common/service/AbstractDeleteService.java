package com.mkhldvdv.bdr.backend.common.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.common.Constants;
import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * Logical remove by default. For physical removal, methods must be overridden
 *
 * @param <I> MongoItem class
 * @param <R> MongoRepository
 */
@Slf4j
@RequiredArgsConstructor
public abstract class AbstractDeleteService<I extends MongoItem, R extends MongoRepository<I, String>> implements IAbstractDeleteService<I> {

    private final R repository;

    @Override
    public I delete(I item) {
        log.info(Constants.LOG_DELETE_ITEM_TEMPLATE, item);
        item.setDeletedFlag();
        repository.save(item);
        return item;
    }

    @Override
    public I deleteById(String itemId) {
        log.info(Constants.LOG_DELETE_ITEM_ID_TEMPLATE, itemId);
        Optional<I> data = repository.findById(itemId);
        data.ifPresent(value -> {
            value.setDeletedFlag();
            repository.save(value);
        });
        return data.orElseGet(() -> {
            log.info(Constants.LOG_NO_ITEM_ID_TEMPLATE, itemId);
            return null;
        });
    }

    /**
     * Writes to log NOT DELETED ID list, returns DELETED ID list
     *
     * @param itemIdList initial ID list to delete
     * @return deleted ID list
     */
    @Override
    public List<String> deleteAllById(List<String> itemIdList) {
        log.info(Constants.LOG_DELETE_ITEM_ID_LIST_TEMPLATE, itemIdList);
        List<I> itemListToDelete = Lists.newArrayList(repository.findAllById(itemIdList)).stream().toList();
        itemListToDelete.forEach(I::setDeletedFlag);
        repository.saveAll(itemListToDelete);

        List<String> itemIdListNotDeleted = Lists.newArrayList(itemIdList);
        List<String> itemIdListToDelete = itemListToDelete.stream().map(I::itemId).toList();
        itemIdListNotDeleted.removeAll(itemIdListToDelete);
        if (itemIdListNotDeleted.isEmpty()) {
            return itemIdList;
        }
        log.info(Constants.LOG_NO_ITEM_ID_LIST_TEMPLATE, itemIdListNotDeleted);
        return itemIdListToDelete;
    }

}
