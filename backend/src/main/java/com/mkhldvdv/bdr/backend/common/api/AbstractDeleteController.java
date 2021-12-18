package com.mkhldvdv.bdr.backend.common.api;

import com.mkhldvdv.bdr.backend.common.Constants;
import com.mkhldvdv.bdr.backend.common.item.MongoItem;
import com.mkhldvdv.bdr.backend.common.service.IAbstractDeleteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractDeleteController<I extends MongoItem, S extends IAbstractDeleteService<I>> {

    private final S service;

    @DeleteMapping
    public I delete(@RequestBody @Valid I item) {
        log.info(Constants.LOG_ITEM_TEMPLATE, item);
        return service.delete(item);
    }

    @DeleteMapping(path = "/{itemId}")
    public I deleteById(@PathVariable String itemId) {
        log.info(Constants.LOG_ITEM_ID_TEMPLATE, itemId);
        return service.deleteById(itemId);
    }

    @DeleteMapping(path = "/list")
    public List<String> deleteAllById(@RequestBody List<String> itemIdList) {
        log.info(Constants.LOG_ITEM_ID_LIST_TEMPLATE, itemIdList);
        return service.deleteAllById(itemIdList);
    }

}
