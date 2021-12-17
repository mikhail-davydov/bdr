package com.mkhldvdv.bdr.backend.v2.common.api;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;
import com.mkhldvdv.bdr.backend.v2.common.service.IAbstractDeleteService;
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

    @DeleteMapping(path = "/user")
    public I delete(@RequestBody @Valid I item) {
        log.info("Item: {}", item);
        return service.delete(item);
    }

    @DeleteMapping(path = "/user/{userId}")
    public I deleteById(@PathVariable String itemId) {
        log.info("ItemId: {}", itemId);
        return service.deleteById(itemId);
    }

    @DeleteMapping(path = "/user/list")
    public List<String> deleteAllById(@RequestBody List<String> itemIdList) {
        log.info("ItemId list: {}", itemIdList);
        return service.deleteAllById(itemIdList);
    }

}
