package org.shymega.java.starlingbank.j4starling.entities.account;

import lombok.Getter;
import org.shymega.java.starlingbank.j4starling.entities.common.AmountObject;

@Getter
public class AccountBalance {
    public AmountObject clearedBalance;
    public AmountObject effectiveBalance;
    public AmountObject pendingTransactions;
    public AmountObject acceptedOverdraft;
    public AmountObject amount;
}
