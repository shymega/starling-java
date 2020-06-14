package org.shymega.java.starlingbank.j4starling.entities.account;

import lombok.Getter;
import java.util.UUID;

@Getter
public class AccountV2 {
    private String description;
    private UUID accountUid;
    private String defaultCategory;
    private String currency;
    private String createdAt;
}
