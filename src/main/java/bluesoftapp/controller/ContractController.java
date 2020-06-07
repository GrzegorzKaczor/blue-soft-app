package bluesoftapp.controller;

import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
}
