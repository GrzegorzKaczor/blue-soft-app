package bluesoftapp.dao;

import bluesoftapp.model.Contract;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractDao {

    List<Contract> getAllContracts();
    void addContract(Contract contract);

}
