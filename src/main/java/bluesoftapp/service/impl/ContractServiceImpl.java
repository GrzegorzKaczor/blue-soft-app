package bluesoftapp.service.impl;

import bluesoftapp.dao.ContractDao;
import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import bluesoftapp.service.mapper.ContractMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

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
        return contractDao.getAllContracts().stream()
                .map(x -> contractMapper.mapToDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<ContractDto> getActiveContracts() {
        return contractDao.getAllContracts().stream()
                .filter(x -> x.getActive().equals(true))
                .map(x -> contractMapper.mapToDto(x))
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> getSystems() {
        Set<String> collect = contractDao.getAllContracts().stream()
                .map(x -> x.getSystem())
                .collect(Collectors.toSet());
        return collect;
    }

    @Override
    public void addContract(ContractDto contractDto) {
        contractDao.addContract(contractMapper.mapToEntity(contractDto));
    }

    @Override
    public void deleteContract(Long id) {
        contractDao.deleteContract(id);
    }

}
