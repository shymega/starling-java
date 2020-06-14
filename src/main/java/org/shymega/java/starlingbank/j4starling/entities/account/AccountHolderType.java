package org.shymega.java.starlingbank.j4starling.entities.account;

import lombok.Getter;

@Getter
public enum AccountHolderType {
    INDIVIDUAL("Individual"),
    BUSINESS("Business"),
    SOLE_TRADER("Sole Trader"),
    JOINT("Joint Account"),
    BANKING_AS_A_SERVICE("Banking as a Service");

    private final String accountHolderType;

    AccountHolderType(String accountHolderType) {
        this.accountHolderType = accountHolderType;
    }
}
