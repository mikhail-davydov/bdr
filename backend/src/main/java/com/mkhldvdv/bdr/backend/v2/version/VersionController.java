package com.mkhldvdv.bdr.backend.v2.version;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class VersionController {

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

}
