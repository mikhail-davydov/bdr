package com.mkhldvdv.bdr.backend.v2.user.service;

import com.mkhldvdv.bdr.backend.v2.common.service.AbstractSaveService;
import com.mkhldvdv.bdr.backend.v2.user.UserItem;
import com.mkhldvdv.bdr.backend.v2.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserSaveService extends AbstractSaveService<UserItem, UserRepository> {

    public UserSaveService(UserRepository repository) {
        super(repository);
    }

}
