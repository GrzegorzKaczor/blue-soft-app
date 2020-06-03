package bluesoftapp.service;


import bluesoftapp.model.dto.ContractDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {

   List<ContractDto> getAllContracts();
   List<ContractDto> getActiveContracts();
   List<String> getSystems();

}
