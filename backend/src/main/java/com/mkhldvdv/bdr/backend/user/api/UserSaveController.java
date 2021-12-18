package com.mkhldvdv.bdr.backend.user.api;

import com.mkhldvdv.bdr.backend.common.api.AbstractSaveController;
import com.mkhldvdv.bdr.backend.user.UserItem;
import com.mkhldvdv.bdr.backend.user.service.UserSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class UserSaveController extends AbstractSaveController<UserItem, UserSaveService> {

    public UserSaveController(UserSaveService service) {
        super(service);
    }

}
