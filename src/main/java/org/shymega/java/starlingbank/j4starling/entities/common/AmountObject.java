package org.shymega.java.starlingbank.j4starling.entities.common;

import lombok.Getter;
import java.math.BigDecimal;

@Getter
public class AmountObject {
    private String currency;
    private BigDecimal minorUnits;

    public BigDecimal toConventionalUnits() {
        return this.minorUnits
                .divide(new BigDecimal(100));
    }
}
