package org.shymega.java.starlingbank.j4starling.entities.account;

import lombok.Getter;
import java.util.UUID;

/**
 * The AccountHolder class encapsulates the
 * AccountHolder's description, unique ID (uid/UUID),
 * and a single enum from the AccountHolderType class.
 *
 * @author Dom Rodriguez
 * @version 0.1.0
 */
@Getter
public class AccountHolder {
    /**
     * The description of the Account Holder.
     */
    public String description;
    /**
     * The unique ID of the Account Holder (uid/UUID).
     */
    private UUID accountHolderUid;
    /**
     * The type of AccountHolder.
     * This is a single enum from the
     * AccountHolderType class.
     */
    private AccountHolderType accountHolderType;

    public AccountHolder(String description, UUID accountHolderUid, AccountHolderType accountHolderType) {
        this.description = description;
        this.accountHolderUid = accountHolderUid;
        this.accountHolderType = accountHolderType;
    }
}