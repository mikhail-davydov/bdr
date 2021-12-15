package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.User;
import com.mkhldvdv.bdr.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/user")
    public User create(@RequestBody User user) {
        log.info("User: {}", user);
        return userService.create(user);
    }

    @PostMapping(path = "/user/list")
    public List<User> create(@RequestBody List<User> userList) {
        log.info("User list: {}", userList);
        return userService.create(userList);
    }

    @DeleteMapping(path = "/user")
    public User delete(@RequestBody User user) {
        log.info("User: {}", user);
        return userService.delete(user);
    }

    @DeleteMapping(path = "/user/{userId}")
    public User deleteById(@PathVariable String userId) {
        log.info("UserId: {}", userId);
        return userService.deleteById(userId);
    }

    @DeleteMapping(path = "/user/list/{userIdList}")
    public List<String> deleteAllById(@PathVariable List<String> userIdList) {
        log.info("UserId list: {}", userIdList);
        return userService.deleteAllById(userIdList);
    }

}
