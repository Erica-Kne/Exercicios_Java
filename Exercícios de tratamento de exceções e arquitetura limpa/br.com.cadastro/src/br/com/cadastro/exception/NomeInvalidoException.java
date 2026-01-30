package br.com.cadastro.exception;

public class NomeInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public NomeInvalidoException(){
	    super("Nome inválido: o nome não pode ser nulo ou vazio");
	  }
	}