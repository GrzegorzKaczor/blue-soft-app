package bluesoftapp.model.dto;

import bluesoftapp.model.AmountPeriod;
import bluesoftapp.model.AmountType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ContractDto {

    private Long id;
    private String system;
    private String orderNumber;
    private LocalDate fromDate;
    private LocalDate toDate;
    private BigDecimal amount;
    private AmountType amountType;
    private AmountPeriod amountPeriod;
    private Boolean active;
}