package bluesoftapp.model;

import lombok.ToString;

/**
 * @author Grzegorz Kaczor
 * @version 1.0.0
 * @since 1.0.0
 */

@ToString
public enum AmountType {

//    NET, BUT;

    NET("netto"),
    BRU("brutto");

    private String value;

    AmountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
