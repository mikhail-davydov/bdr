package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.UserRecord;
import com.mkhldvdv.bdr.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    // create / update
    @PostMapping(path = "/user")
    public UserRecord createOrUpdate(@RequestBody @Valid UserRecord user) {
        log.info("User: {}", user);
        return userService.createOrUpdate(user);
    }

    @PostMapping(path = "/user/list")
    public List<UserRecord> createOrUpdate(@RequestBody @Valid List<UserRecord> userList) {
        log.info("User list: {}", userList);
        return userService.createOrUpdate(userList);
    }

    // delete
    @DeleteMapping(path = "/user")
    public UserRecord delete(@RequestBody @Valid UserRecord user) {
        log.info("User: {}", user);
        return userService.delete(user);
    }

    @DeleteMapping(path = "/user/{userId}")
    public UserRecord deleteById(@PathVariable String userId) {
        log.info("UserId: {}", userId);
        return userService.deleteById(userId);
    }

    @DeleteMapping(path = "/user/list")
    public List<String> deleteAllById(@RequestBody List<String> userIdList) {
        log.info("UserId list: {}", userIdList);
        return userService.deleteAllById(userIdList);
    }

}
