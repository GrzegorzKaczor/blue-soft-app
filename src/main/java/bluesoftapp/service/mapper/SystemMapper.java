package bluesoftapp.service.mapper;

import bluesoftapp.model.System;
import bluesoftapp.model.dto.SystemDto;

public interface SystemMapper {

    System mapToEntity(SystemDto systemDto);

    SystemDto mapToDto(System system);

}
