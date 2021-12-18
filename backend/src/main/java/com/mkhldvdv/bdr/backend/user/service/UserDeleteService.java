package com.mkhldvdv.bdr.backend.user.service;

import com.mkhldvdv.bdr.backend.common.service.AbstractDeleteService;
import com.mkhldvdv.bdr.backend.user.UserItem;
import com.mkhldvdv.bdr.backend.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDeleteService extends AbstractDeleteService<UserItem, UserRepository> {

    public UserDeleteService(UserRepository repository) {
        super(repository);
    }

}
