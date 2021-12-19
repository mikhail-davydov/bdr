package com.mkhldvdv.bdr.backend.user.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractSaveService;
import com.mkhldvdv.bdr.backend.user.UserRepository;
import com.mkhldvdv.bdr.backend.user.item.UserItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserSaveService extends AbstractSaveService<UserItem, UserRepository> {

    public UserSaveService(UserRepository repository) {
        super(repository);
    }

}
