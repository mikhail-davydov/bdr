package com.mkhldvdv.bdr.backend.v2.common.service;

import java.util.List;

public interface IAbstractDeleteService<I> {

    I delete(I item);

    I deleteById(String itemId);

    List<String> deleteAllById(List<String> itemIdList);



}
