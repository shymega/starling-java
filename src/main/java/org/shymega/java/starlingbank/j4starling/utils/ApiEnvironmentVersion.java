package org.shymega.java.starlingbank.j4starling.utils;

import lombok.Getter;

@Getter
public enum ApiEnvironmentVersion {
    ENV_VERSION_V1("v1"),
    ENV_VERSION_V2("v2");

    private final String apiEnvVer;

    ApiEnvironmentVersion(String apiEnvVer) {
        this.apiEnvVer = apiEnvVer;
    }
}
