package bluesoftapp.controller;

import bluesoftapp.service.ContractService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contract")
public class ContractController {

    private ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/all")
    public String getAllContracts() {
        Gson gson = new Gson();
        return gson.toJson(contractService.getAllContracts());
    }

    @GetMapping("/active")
    public String getActiveContracts() {
        Gson gson = new Gson();
        return gson.toJson(contractService.getActiveContracts());
    }

}
