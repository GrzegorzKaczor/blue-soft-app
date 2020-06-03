package bluesoftapp.model.dto;

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
    private String amountType;
    private String amountPeriod;
    private Boolean active;
}
