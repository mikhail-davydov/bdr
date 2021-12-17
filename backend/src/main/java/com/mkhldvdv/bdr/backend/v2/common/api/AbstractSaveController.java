package com.mkhldvdv.bdr.backend.v2.common.api;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
import com.mkhldvdv.bdr.backend.v2.common.service.IAbstractSaveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSaveController<I extends MongoItem, S extends IAbstractSaveService<I>> {

    private final S service;

    @PostMapping(path = "/user")
    public I createOrUpdate(@RequestBody @Valid I item) {
        log.info("Item: {}", item);
        return service.save(item);
    }

    @PostMapping(path = "/user/list")
    public List<I> createOrUpdate(@RequestBody @Valid List<I> itemList) {
        log.info("Item list: {}", itemList);
        return service.save(itemList);
    }

}
