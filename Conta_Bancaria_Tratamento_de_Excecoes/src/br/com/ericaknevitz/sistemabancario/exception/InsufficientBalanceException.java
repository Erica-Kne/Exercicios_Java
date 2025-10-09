package br.com.ericaknevitz.sistemabancario.exception;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("Not enough balance");
    }

}
