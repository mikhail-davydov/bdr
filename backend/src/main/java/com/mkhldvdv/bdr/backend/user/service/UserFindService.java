package com.mkhldvdv.bdr.backend.user.service;

import java.util.List;

import com.mkhldvdv.bdr.backend.common.service.AbstractFindService;
import com.mkhldvdv.bdr.backend.user.dao.UserRepository;
import com.mkhldvdv.bdr.backend.user.item.UserItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.mkhldvdv.bdr.backend.common.Constants.USER;

@Service
@Slf4j
public class UserFindService extends AbstractFindService<UserItem, UserRepository> {

    public UserFindService(UserRepository repository) {
        super(repository);
    }

    @Override
    public List<UserItem> findAll() {
        return findAll(USER);
    }
}
