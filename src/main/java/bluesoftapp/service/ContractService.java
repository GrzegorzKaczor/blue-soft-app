package bluesoftapp.service;


import bluesoftapp.model.dto.ContractDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Service
public interface ContractService {

    List<ContractDto> getAllContracts();

    List<ContractDto> getActiveContracts();

    Set<String> getSystems();

    void addContract(ContractDto contractDto);

    void deleteContract(Long id);

    void updateContract(ContractDto contractDto);

    ContractDto getById(Long id);
}
