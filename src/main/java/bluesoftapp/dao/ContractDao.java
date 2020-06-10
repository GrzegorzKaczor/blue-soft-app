package bluesoftapp.dao;

import bluesoftapp.model.Contract;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Repository
public interface ContractDao {

    List<Contract> getAllContracts();

    void addContract(Contract contract);

    void deleteContract(Long id);

    void updateContract(Contract contract);

    Contract getById(Long id);
}
