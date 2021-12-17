package com.mkhldvdv.bdr.backend.v2.common.service;

import com.mkhldvdv.bdr.backend.v2.common.item.MongoItem;

import java.util.List;

public interface IAbstractSaveService<I extends MongoItem> {

    I save(I item);

    List<I> save(List<I> itemList);

}
