package bluesoftapp.service.mapper;

import bluesoftapp.model.Contract;
import bluesoftapp.model.dto.ContractDto;
import org.springframework.stereotype.Component;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Component
public interface ContractMapper {

    Contract mapToEntity(ContractDto contractDto);

    ContractDto mapToDto(Contract contract);
}
