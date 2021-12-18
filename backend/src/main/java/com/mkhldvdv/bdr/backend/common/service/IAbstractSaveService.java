package com.mkhldvdv.bdr.backend.common.service;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;

import java.util.List;

public interface IAbstractSaveService<I extends MongoItem> {

    I save(I item);

    List<I> save(List<I> itemList);

}
