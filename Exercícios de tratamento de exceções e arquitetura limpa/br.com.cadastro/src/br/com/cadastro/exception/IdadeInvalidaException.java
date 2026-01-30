package br.com.cadastro.exception;

public class IdadeInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;

	public IdadeInvalidaException(){
	    super("Idade inválida: a idade deve ser maior que zero.");
	  }
	}