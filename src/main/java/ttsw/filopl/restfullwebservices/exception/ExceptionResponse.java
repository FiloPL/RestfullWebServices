package ttsw.filopl.restfullwebservices.exception;

import javax.xml.crypto.Data;

/**
 * Created by T. Filo Zegarlicki on 09.06.2022
 **/

public class ExceptionResponse {

    private Data timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Data timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Data getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Data timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
