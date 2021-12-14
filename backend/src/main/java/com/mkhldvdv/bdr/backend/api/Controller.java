package com.mkhldvdv.bdr.backend.api;

import com.mkhldvdv.bdr.backend.domain.User;
import com.mkhldvdv.bdr.backend.domain.Version;
import com.mkhldvdv.bdr.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final UserService userService;
    @Value("${api.version}")
    private String apiVersion;

    @GetMapping(path = "/version")
    public Version version() {
        Version version = Version.builder()
                .apiVersion(apiVersion)
                .build();
        log.info("API Version: {}", version.getApiVersion());
        return version;
    }

    @PostMapping(path = "/user")
    public User create(@RequestBody User user) {
        log.info("User: {}", user);
        return userService.create(user);
    }

}
