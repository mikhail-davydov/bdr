package com.mkhldvdv.bdr.backend.common.api;

import com.mkhldvdv.bdr.backend.common.Constants;
import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import com.mkhldvdv.bdr.backend.common.service.IAbstractSaveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSaveController<I extends MongoItem, IL extends MongoItemList<I>, S extends IAbstractSaveService<I>> {

    private final S service;

    @PostMapping
    public I createOrUpdate(@RequestBody @Valid I item) {
        log.info(Constants.LOG_ITEM_TEMPLATE, item);
        return service.save(item);
    }

    @PostMapping(path = "/list")
    public List<I> createOrUpdate(@RequestBody @Valid IL itemList) {
        log.info(Constants.LOG_ITEM_LIST_TEMPLATE, itemList);
        return service.save(itemList.items());
    }

}
