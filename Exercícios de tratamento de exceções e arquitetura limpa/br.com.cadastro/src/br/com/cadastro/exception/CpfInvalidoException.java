package br.com.cadastro.exception;

public class CpfInvalidoException extends Exception{


	private static final long serialVersionUID = 1L;

	public CpfInvalidoException(){
	    super("CPF inválido: o CPF não pode ser nulo ou vazio");
	  }
	}