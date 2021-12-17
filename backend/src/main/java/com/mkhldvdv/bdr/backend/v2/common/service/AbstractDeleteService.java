package com.mkhldvdv.bdr.backend.v2.common.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
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
        log.info("Delete item: {}", item);
        repository.delete(item);
        return item;
    }

    @Override
    public I deleteById(String itemId) {
        log.info("Delete item by ID: {}", itemId);
        Optional<I> data = repository.findById(itemId);
        data.ifPresent(value -> repository.deleteById(itemId));
        return data.orElseGet(() -> {
            log.info("No item record with ID: {}", itemId);
            return null;
        });
    }

    @Override
    public List<String> deleteAllById(List<String> itemIdList) {
        log.info("Delete item list by IDs: {}", itemIdList);
        List<String> itemIdListToDelete = Lists.newArrayList(repository.findAllById(itemIdList)).stream()
                .map(I::getItemId)
                .toList();
        repository.deleteAllById(itemIdListToDelete);
        List<String> itemIdListNotDeleted = Lists.newArrayList(itemIdList);
        itemIdListNotDeleted.removeAll(itemIdListToDelete);
        if (itemIdListNotDeleted.isEmpty()) {
            return itemIdList;
        }
        log.info("No item list IDs: {}", itemIdListNotDeleted);
        return itemIdListToDelete;
    }

}
