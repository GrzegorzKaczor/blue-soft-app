package bluesoftapp.controller;

import bluesoftapp.model.AmountPeriod;
import bluesoftapp.model.AmountType;
import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.model.dto.SystemDto;
import bluesoftapp.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@RestController
@RequestMapping("/contract")
public class ContractController {

    private ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/all")
    public @ResponseBody
    List<ContractDto> getAllContractsA() {
        return contractService.getAllContracts();
    }

    @GetMapping("/active")
    public @ResponseBody
    List<ContractDto> getActiveContracts() {
        return contractService.getActiveContracts();
    }

//    @GetMapping("/system")
//    public Set<String> getSystems() {
//        return contractService.getSystems();
//    }

    @PostMapping
    public void addContract(@RequestBody @Valid ContractDto contractDto) {
        contractService.addContract(contractDto);
    }

    @DeleteMapping({"/{id}"})
    public void deleteContract(@PathVariable(value = "id") Long id) {
        contractService.deleteContract(id);
    }

    @PutMapping
    public void updateContract(@RequestBody ContractDto contractDto) {
        contractService.updateContract(contractDto);
    }

    @GetMapping("/{id}")
    public ContractDto getById(@PathVariable(value = "id") Long id ){
        return contractService.getById(id);
    }


    @GetMapping("/add")
    public void addTest(){
        ContractDto contractDto = new ContractDto();
        SystemDto systemDto = new SystemDto();
        systemDto.setName("Kaczor");
        systemDto.setDescriptionSystem("Opis systemu");
        systemDto.setTechnologies("Java ipt");
        systemDto.setOwner("BlueSoft");
        contractDto.setSystemDto(systemDto);
        contractDto.setOrderNumber("222/2020");
        contractDto.setFromDate(LocalDate.of(2020, 12,12));
        contractDto.setToDate(LocalDate.of(2020,11,11));
        contractDto.setAmount(BigDecimal.valueOf(10000L));
        contractDto.setAmountType(AmountType.NET);
        contractDto.setAmountPeriod(AmountPeriod.MONTH);
        contractDto.setActive(true);
        contractService.addContract(contractDto);


    }
}
