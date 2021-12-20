package com.mkhldvdv.bdr.backend.common.item;

import java.util.List;

public abstract class MongoItemList<I> {

    public abstract List<String> ids();

    public abstract List<I> items();

}
