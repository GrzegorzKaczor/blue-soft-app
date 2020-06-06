package bluesoftapp.service;


import bluesoftapp.model.dto.ContractDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface ContractService {

   List<ContractDto> getAllContracts();
   List<ContractDto> getActiveContracts();
   Set<String> getSystems();
   void addContract(ContractDto contractDto);
   void deleteContract(Long id);

}
