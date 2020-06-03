package bluesoftapp.service.mapper;

import bluesoftapp.model.Contract;
import bluesoftapp.model.dto.ContractDto;
import org.springframework.stereotype.Component;

@Component
public interface ContractMapper {

    Contract mapToEntity(ContractDto contractDto);

    ContractDto mapToDto(Contract contract);
}
