package bluesoftapp.controller;


import bluesoftapp.model.System;
import bluesoftapp.model.dto.SystemDto;
import bluesoftapp.service.SystemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@RestController
@RequestMapping("/system")
public class SystemController {

    private SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping("/all")
    public List<SystemDto> getSystems() {
    return systemService.getAllSystems();
    }
}
