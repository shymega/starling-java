package org.shymega.java.starlingbank.j4starling.entities.common;

import lombok.Data;

@Data
public class TransactionObject {
    private String feedItemUid;
    private String categoryUid;
    public AmountObject amount;
    public AmountObject sourceAmount;
    private String direction;
    private String updatedAt;
    private String transactionTime;
    private String settlementTime;
    private String source;
    private String status;
    private String counterPartyType;
    private String counterPartyUid;
    private String counterPartyName;
    private String counterPartySubEntityUid;
    private String counterPartySubEntityName;
    private String counterPartySubEntityIdentifier;
    private String counterPartySubEntitySubIdentifier;
    private String reference;
    private String country;
    private String spendingCategory;
    private boolean hasAttachment;
}
