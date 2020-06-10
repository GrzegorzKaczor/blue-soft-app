package bluesoftapp.service.mapper.impl;

import bluesoftapp.model.System;
import bluesoftapp.model.dto.SystemDto;
import bluesoftapp.service.mapper.SystemMapper;
import org.springframework.stereotype.Component;

@Component
public class SystemMapperImpl implements SystemMapper {


    @Override
    public System mapToEntity(SystemDto systemDto) {
        System system = new System();
        system.setId(systemDto.getId());
        system.setName(systemDto.getName());
        system.setDescriptionSystem(systemDto.getDescriptionSystem());
        system.setTechnologies(systemDto.getTechnologies());
        system.setOwner(systemDto.getOwner());
        return system;
    }

    @Override
    public SystemDto mapToDto(System system) {
        SystemDto systemDto = new SystemDto();
        systemDto.setId(system.getId());
        systemDto.setName(system.getName());
        systemDto.setDescriptionSystem(system.getDescriptionSystem());
        systemDto.setTechnologies(system.getTechnologies());
        systemDto.setOwner(systemDto.getOwner());
        return systemDto;
    }
}
