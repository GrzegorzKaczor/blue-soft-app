package bluesoftapp.model;

import lombok.ToString;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@ToString
public enum AmountPeriod {

//    MONTH, TEAR;

    MONTH("na miesiąc"),
    YEAR("na rok");
    //
    private String value;

    //
    AmountPeriod(String value) {
        this.value = value;
    }
}
