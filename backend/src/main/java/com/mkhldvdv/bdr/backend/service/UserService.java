package com.mkhldvdv.bdr.backend.service;

import com.google.common.collect.Lists;
import com.mkhldvdv.bdr.backend.dao.UserRepository;
import com.mkhldvdv.bdr.backend.domain.UserRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    // create
    public UserRecord createOrUpdate(UserRecord user) {
        log.info("Create User: {}", user);
        return userRepository.save(user);
    }

    public List<UserRecord> createOrUpdate(List<UserRecord> userList) {
        log.info("Create User list: {}", userList);
        return userRepository.saveAll(userList);
    }

    // delete
    public UserRecord delete(UserRecord user) {
        log.info("Delete User: {}", user);
        userRepository.delete(user);
        return user;
    }

    public UserRecord deleteById(String userId) {
        log.info("Delete User by ID: {}", userId);
        Optional<UserRecord> user = userRepository.findById(userId);
        user.ifPresent(value -> userRepository.deleteById(userId));
        return user.orElseGet(() -> {
            log.info("No User record with ID: {}", userId);
            return null;
        });
    }

    public List<String> deleteAllById(List<String> userIdList) {
        log.info("Delete User list by IDs: {}", userIdList);
        List<String> userIdListToDelete = Lists.newArrayList(userRepository.findAllById(userIdList)).stream()
                .map(UserRecord::getUserId)
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
