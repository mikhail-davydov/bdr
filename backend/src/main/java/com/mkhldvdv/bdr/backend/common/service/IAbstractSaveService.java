package com.mkhldvdv.bdr.backend.common.service;

import java.util.List;

import com.mkhldvdv.bdr.backend.common.item.MongoItem;

public interface IAbstractSaveService<I extends MongoItem> {

    I save(I item);

    List<I> save(List<I> itemList);

}
