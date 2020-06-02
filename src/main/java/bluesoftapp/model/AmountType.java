package bluesoftapp.model;

import lombok.ToString;

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
