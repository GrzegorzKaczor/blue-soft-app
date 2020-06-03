package bluesoftapp.controller;

import bluesoftapp.model.dto.ContractDto;
import bluesoftapp.service.ContractService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<String> getSystems() {
        return contractService.getSystems();
    }

    @PostMapping
    public void addContract(@RequestBody ContractDto contractDto) {
        contractService.addContract(contractDto);
    }


}
