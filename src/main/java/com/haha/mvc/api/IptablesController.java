package com.haha.mvc.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: haha
 * @date : 2021-01-04 14:56
 */
@Slf4j
@RestController
@RequestMapping("iptables")
public class IptablesController {

    @GetMapping("list")
    public void list() {
    }

    @GetMapping("info")
    public void info(@RequestParam String id) {
    }

}
