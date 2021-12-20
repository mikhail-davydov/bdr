package com.mkhldvdv.bdr.backend.common.api;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import com.mkhldvdv.bdr.backend.common.service.IAbstractFindService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_ITEM_ID_TEMPLATE;
import static com.mkhldvdv.bdr.backend.common.Constants.LOG_ITEM_LIST_TEMPLATE;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractFindController<I extends MongoItem, IL extends MongoItemList<I>, S extends IAbstractFindService<I>> {

    private final S service;

    @GetMapping(path = "/{itemId}")
    public I findItem(@PathVariable String itemId) {
        log.info(LOG_ITEM_ID_TEMPLATE, itemId);
        return service.findItemById(itemId);
    }

    @GetMapping(path = "/list")
    public List<I> findItemList(@RequestBody IL itemIdList) {
        log.info(LOG_ITEM_LIST_TEMPLATE, itemIdList);
        return service.findAllById(itemIdList.ids());
    }
}
