package bluesoftapp.service.impl;

import bluesoftapp.dao.ContractDao;
import bluesoftapp.model.Contract;
import bluesoftapp.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {


    private ContractDao contractDao;

    @Autowired
    public ContractServiceImpl(ContractDao contractDao) {
        this.contractDao = contractDao;
    }

    @Override
    public List<Contract> getAllContracts() {
        return contractDao.getAllContracts();
    }


}
