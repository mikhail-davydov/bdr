package com.mkhldvdv.bdr.backend.common.service;

import java.util.List;

public interface IAbstractDeleteService<I> {

    I deleteById(String itemId);

    List<String> deleteAllById(List<String> itemIdList);

}
