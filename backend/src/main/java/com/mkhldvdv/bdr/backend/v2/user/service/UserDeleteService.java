package com.mkhldvdv.bdr.backend.v2.user.service;

import com.mkhldvdv.bdr.backend.v2.common.service.AbstractDeleteService;
import com.mkhldvdv.bdr.backend.v2.common.service.IAbstractDeleteService;
import com.mkhldvdv.bdr.backend.v2.common.service.IAbstractSaveService;
import com.mkhldvdv.bdr.backend.v2.user.UserItem;
import com.mkhldvdv.bdr.backend.v2.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDeleteService extends AbstractDeleteService<UserItem, UserRepository> {

    public UserDeleteService(UserRepository repository) {
        super(repository);
    }

}
