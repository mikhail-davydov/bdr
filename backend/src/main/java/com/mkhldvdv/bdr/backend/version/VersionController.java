package com.mkhldvdv.bdr.backend.version;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.mkhldvdv.bdr.backend.common.Constants.LOG_API_VERSION_TEMPLATE;

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
        log.info(LOG_API_VERSION_TEMPLATE, version.getApiVersion());
        return version;
    }

}
