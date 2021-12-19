package com.mkhldvdv.bdr.backend.user.item;

import com.mkhldvdv.bdr.backend.common.item.MongoItemList;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserItemList extends MongoItemList<UserItem> {

    private List<String> userIdList;
    private List<UserItem> userList;

    @Override
    public List<String> ids() {
        return userIdList;
    }

    @Override
    public List<UserItem> items() {
        return userList;
    }
}
