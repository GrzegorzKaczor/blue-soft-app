package bluesoftapp.model;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @OneToOne
    private System system;
    @NotNull
    @Column(name = "order_number")
    private String orderNumber;
    @NotNull
    @Column(name = "from_date")
    private LocalDate fromDate;
    @NotNull
    @Column(name = "to_date")
    private LocalDate toDate;
    @NotNull
    @Column(name = "amount")
    private BigDecimal amount;
    @NotNull
    @Column(name = "amount_type")
    private AmountType amountType;
    @NotNull
    @Column(name = "amount_period")
    private AmountPeriod amountPeriod;
    @NotNull
    @Column(name = "active")
    private Boolean active;

}
