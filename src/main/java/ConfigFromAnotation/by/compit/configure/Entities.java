package configure;

public class Entities {

    private String message;
    private int value;

    public Entities(){}

    public Entities(String message, int value) {
        this.message = message;
        this.value = value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "message='" + message + '\'' +
                ", value=" + value +
                '}';
    }
}
