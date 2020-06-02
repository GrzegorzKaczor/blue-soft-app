package bluesoftapp.model;

import lombok.ToString;

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
