package com.mkhldvdv.bdr.backend.common.service;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;

import java.util.List;

public interface IAbstractFindService<I extends MongoItem> {

    I findItemById(String itemId);

    List<I> findAllById(List<String> itemIdList);

}
