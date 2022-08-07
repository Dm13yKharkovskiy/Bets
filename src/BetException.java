class BetException extends Exception {

    public BetException() {
        super();
    }

    public BetException(String message) {
        super(message);
    }

    public BetException(String message, Throwable cause) {
        super(message, cause);
    }

    public BetException(Throwable cause) {
        super(cause);
    }

    protected BetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
