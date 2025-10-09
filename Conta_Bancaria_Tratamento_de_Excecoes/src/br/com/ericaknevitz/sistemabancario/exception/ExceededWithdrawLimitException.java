package br.com.ericaknevitz.sistemabancario.exception;

public class ExceededWithdrawLimitException extends Exception {
    
    public ExceededWithdrawLimitException() {
        super("The amount exceeds withdraw limit");
    }

}
