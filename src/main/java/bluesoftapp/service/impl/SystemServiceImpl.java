package bluesoftapp.service.impl;

import bluesoftapp.dao.SystemDao;
import bluesoftapp.model.dto.SystemDto;
import bluesoftapp.service.SystemService;
import bluesoftapp.service.mapper.SystemMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class SystemServiceImpl implements SystemService {

    private SystemDao systemDao;
    private SystemMapper systemMapper;

    public SystemServiceImpl(SystemDao systemDao, SystemMapper systemMapper) {
        this.systemDao = systemDao;
        this.systemMapper = systemMapper;
    }

    @Override
    public List<SystemDto> getAllSystems() {
        return systemDao.getAllSystems().stream()
                .map(x -> systemMapper.mapToDto(x))
                .collect(Collectors.toList());
    }
}
