public class NameException extends NullPointerException{
    public NameException() {
        super("Incorrect name");
    }

    public NameException(String message) {
        super(message);
    }
}

