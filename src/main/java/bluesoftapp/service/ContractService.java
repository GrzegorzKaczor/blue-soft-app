package bluesoftapp.service;


import bluesoftapp.model.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContractService {

   List<Contract> getAllContracts();

}
