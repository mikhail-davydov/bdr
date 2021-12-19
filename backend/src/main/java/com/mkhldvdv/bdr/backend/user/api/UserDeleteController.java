package com.mkhldvdv.bdr.backend.user.api;

import com.mkhldvdv.bdr.backend.common.api.AbstractDeleteController;
import com.mkhldvdv.bdr.backend.user.item.UserItem;
import com.mkhldvdv.bdr.backend.user.item.UserItemList;
import com.mkhldvdv.bdr.backend.user.service.UserDeleteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class UserDeleteController extends AbstractDeleteController<UserItem, UserItemList, UserDeleteService> {

    public UserDeleteController(UserDeleteService service) {
        super(service);
    }

}
