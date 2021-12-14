package com.mkhldvdv.bdr.backend.service;

import com.mkhldvdv.bdr.backend.dao.UserRepository;
import com.mkhldvdv.bdr.backend.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public User create(User user) {
        log.info("User: {}", user);
        return userRepository.insert(user);
    }

}
