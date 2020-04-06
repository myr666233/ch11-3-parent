package com.github.weilai.controller;

import com.github.weilai.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("configConsumer")
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @GetMapping("/getConfigInfo")
    public ResponseEntity<String> getConfigInfo() {
        return ResponseEntity.ok(configInfoProperties.getConfig());
    }
}
