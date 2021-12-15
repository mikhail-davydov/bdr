package com.mkhldvdv.bdr.backend.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.dao.UserRepository;
import com.mkhldvdv.bdr.backend.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    // create
    public User create(User user) {
        log.info("Create User: {}", user);
        return userRepository.insert(user);
    }

    public List<User> create(List<User> userList) {
        log.info("Create User list: {}", userList);
        return userRepository.insert(userList);
    }

    // delete
    public User delete(User user) {
        log.info("Delete User: {}", user);
        userRepository.delete(user);
        return user;
    }

    public User deleteById(String userId) {
        log.info("Delete User by ID: {}", userId);
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(value -> userRepository.deleteById(userId));
        return user.orElseGet(() -> {
            log.info("No User record with ID: {}", userId);
            return null;
        });
    }

    public List<String> deleteAllById(List<String> userIdList) {
        log.info("Delete User list by IDs: {}", userIdList);
        List<String> userIdListToDelete = Lists.newArrayList(userRepository.findAllById(userIdList)).stream()
                .map(User::getUserId)
                .toList();
        userRepository.deleteAllById(userIdListToDelete);
        List<String> userIdListNotDeleted = Lists.newArrayList(userIdList);
        userIdListNotDeleted.removeAll(userIdListToDelete);
        if (userIdListNotDeleted.isEmpty()) {
            return userIdList;
        }
        log.info("No User list IDs: {}", userIdListNotDeleted);
        return userIdListToDelete;
    }

}
