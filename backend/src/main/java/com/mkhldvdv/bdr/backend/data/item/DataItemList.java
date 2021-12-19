package com.mkhldvdv.bdr.backend.data.item;

import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataItemList extends MongoItemList<DataItem> {

    private List<String> dataIdList;
    private List<DataItem> dataList;

    @Override
    public List<String> ids() {
        return dataIdList;
    }

    @Override
    public List<DataItem> items() {
        return dataList;
    }
}
