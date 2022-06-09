package ttsw.filopl.restfullwebservices.hello;

/**
 * Created by T. Filo Zegarlicki on 08.06.2022
 **/


public class HelloBean {

    private String message;
    public HelloBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloBean [message=%s]", message);
    }

}
