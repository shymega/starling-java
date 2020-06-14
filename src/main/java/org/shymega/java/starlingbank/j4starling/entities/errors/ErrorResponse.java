package org.shymega.java.starlingbank.j4starling.entities.errors;

import org.shymega.java.starlingbank.j4starling.entities.errors.ErrorDetail;
import lombok.Data;

@Data
public class ErrorResponse {
    private ErrorDetail[] errors;
    private boolean success;
}
