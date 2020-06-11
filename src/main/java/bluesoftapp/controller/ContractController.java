package bluesoftapp.controller;

import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public void addContract(@RequestBody @Valid ContractDto contractDto) {
        contractService.addContract(contractDto);
    }

    @DeleteMapping({"/{id}"})
    public void deleteContract(@PathVariable(value = "id") Long id) {
        contractService.deleteContract(id);
    }

    @PutMapping
    public void updateContract(@RequestBody @Valid ContractDto contractDto) {
        contractService.updateContract(contractDto);
    }

    @GetMapping("/{id}")
    public ContractDto getById(@PathVariable(value = "id") Long id ){
        return contractService.getById(id);
    }

}
