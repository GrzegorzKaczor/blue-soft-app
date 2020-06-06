package bluesoftapp.controller;

import bluesoftapp.model.AmountPeriod;
import bluesoftapp.model.AmountType;
import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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

    @GetMapping("/system")
    public Set<String> getSystems() {
        return contractService.getSystems();
    }

    @PostMapping
    public void addContract(@RequestBody @Valid ContractDto contractDto) {
        contractService.addContract(contractDto);
    }

    @DeleteMapping({"/{id}"})
    public void deleteContract (@PathVariable(value = "id") Long id){
        contractService.deleteContract(id);
    }

    @GetMapping("/test")
    public void addTest(){
        ContractDto contractDto = new ContractDto();
        contractDto.setId(100L);
        contractDto.setSystem("SystemTest");
        contractDto.setOrderNumber("122/2012");
        contractDto.setFromDate(LocalDate.of(2012, 2 ,2));
        contractDto.setToDate(LocalDate.of(2019, 2 ,2));
        contractDto.setAmount(BigDecimal.valueOf(10000));
        contractDto.setAmountType(AmountType.BRU);
        contractDto.setAmountPeriod(AmountPeriod.YEAR);
        contractDto.setActive(true);

        contractService.addContract(contractDto);

    }

}
