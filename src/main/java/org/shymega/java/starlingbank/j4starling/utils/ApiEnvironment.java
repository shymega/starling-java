package org.shymega.java.starlingbank.j4starling.utils;

import lombok.Getter;

/*
 * derived from Jarling. Thanks!
 * TODO: Provide attribution (URL).
 */

@Getter
public enum ApiEnvironment {
    PRODUCTION_ENV("https://api.starlingbank.com"),
    SANDBOX_ENV("https://api-sandbox.starlingbank.com");

    private final String apiEnv;

    ApiEnvironment(String apiEnv) {
        this.apiEnv = apiEnv + "/api/";
    }
}
