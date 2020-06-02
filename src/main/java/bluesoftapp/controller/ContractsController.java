package bluesoftapp.controller;

import bluesoftapp.service.ContractService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class ContractsController {

    private ContractService contractService;

    public ContractsController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    public String getAllContracts() {
        Gson gson = new Gson();
        return gson.toJson(contractService.getAllContracts());
    }

//    @GetMapping
//    public String getAllContracts() {
//        return "test controllera";
//
//    }

}
