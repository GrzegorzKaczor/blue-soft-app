package bluesoftapp.service.mapper.impl;


import bluesoftapp.model.Contract;
import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.mapper.ContractMapper;
import bluesoftapp.service.mapper.SystemMapper;
import org.springframework.stereotype.Component;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */
@Component
public class ContractMapperImpl implements ContractMapper {

    private SystemMapper systemMapper;

    public ContractMapperImpl(SystemMapper systemMapper) {
        this.systemMapper = systemMapper;
    }

    @Override
    public Contract mapToEntity(ContractDto contractDto) {
        Contract contract = new Contract();
        contract.setId(contractDto.getId());
        contract.setSystem(systemMapper.mapToEntity(contractDto.getSystemDto()));
        contract.setOrderNumber(contractDto.getOrderNumber());
        contract.setFromDate(contractDto.getFromDate());
        contract.setToDate(contractDto.getToDate());
        contract.setAmount(contractDto.getAmount());
        contract.setAmountType(contractDto.getAmountType());
        contract.setAmountPeriod(contractDto.getAmountPeriod());
        contract.setActive(contractDto.getActive());
        return contract;
    }

    @Override
    public ContractDto mapToDto(Contract contract) {
        ContractDto contractDto = new ContractDto();
        contractDto.setId(contract.getId());
        contractDto.setSystemDto(systemMapper.mapToDto(contract.getSystem()));
        contractDto.setOrderNumber(contract.getOrderNumber());
        contractDto.setFromDate(contract.getFromDate());
        contractDto.setToDate(contract.getToDate());
        contractDto.setAmount(contract.getAmount());
        contractDto.setAmountType(contract.getAmountType());
        contractDto.setAmountPeriod(contract.getAmountPeriod());
        contractDto.setActive(contract.getActive());
        return contractDto;
    }


}
