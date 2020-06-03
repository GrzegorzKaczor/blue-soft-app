package bluesoftapp.service.impl;

import bluesoftapp.dao.ContractDao;
import bluesoftapp.model.Contract;
import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import bluesoftapp.service.mapper.ContractMapper;
import bluesoftapp.service.mapper.impl.ContractMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContractServiceImpl implements ContractService {


    private final ContractDao contractDao;
    private ContractMapper contractMapper;


    public ContractServiceImpl(ContractDao contractDao, ContractMapper contractMapper) {
        this.contractDao = contractDao;
        this.contractMapper = contractMapper;
    }

    @Override
    public List<ContractDto> getAllContracts() {
        List<Contract> contractList = contractDao.getAllContracts();

        List<ContractDto> collect = contractList.stream()
                .map(x -> contractMapper.mapToDto(x))
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<ContractDto> getActiveContracts() {
        List<Contract> contractList = contractDao.getAllContracts();

        return contractList.stream()
                .filter(x -> x.getActive().equals(true))
                .map(x -> contractMapper.mapToDto(x))
                .collect(Collectors.toList());
    }

}
