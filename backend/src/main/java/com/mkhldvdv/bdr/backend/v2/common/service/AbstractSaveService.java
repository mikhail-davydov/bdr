package com.mkhldvdv.bdr.backend.v2.common.service;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSaveService<I extends MongoItem, R extends MongoRepository<I, String>> implements IAbstractSaveService<I> {

    private final R repository;

    @Override
    public I save(I item) {
        log.info("Create item: {}", item);
        return repository.save(item);
    }

    @Override
    public List<I> save(List<I> itemList) {
        log.info("Create items list: {}", itemList);
        return repository.saveAll(itemList);
    }

}
