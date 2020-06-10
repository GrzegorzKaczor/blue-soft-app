package bluesoftapp.service;

import bluesoftapp.model.dto.SystemDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Service
public interface SystemService {

    List<SystemDto> getAllSystems();

}
