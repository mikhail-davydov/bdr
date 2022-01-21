package com.mkhldvdv.bdr.backend.common.service;

import java.util.List;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;

public interface IAbstractFindService<I extends MongoItem> {

    I findItemById(String itemId);

    List<I> findAllById(List<String> itemIdList);

    List<I> findAll(String itemName);

    List<I> findAll();

}
