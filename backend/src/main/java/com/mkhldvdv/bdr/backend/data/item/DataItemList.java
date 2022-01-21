package com.mkhldvdv.bdr.backend.data.item;

import java.util.List;

import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
