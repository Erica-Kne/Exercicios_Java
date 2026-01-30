package br.com.cadastro.model;

import br.com.cadastro.exception.CpfInvalidoException;
import br.com.cadastro.exception.IdadeInvalidaException;
import br.com.cadastro.exception.NomeInvalidoException;
import br.com.cadastro.utils.CpfUtils;

public class Pessoa{
	  private String nome;
	  private String cpf;
	  private int idade;

	  public Pessoa(String nome, String cpf, int idade) throws NomeInvalidoException,CpfInvalidoException, IdadeInvalidaException {
	    if(nome == null || nome.trim().isEmpty()){
	      throw new NomeInvalidoException();
	    } else{
	      this.nome = nome;
	    }
	    if(cpf == null || cpf.trim().isEmpty() || cpf.length() != 11){
	      throw new CpfInvalidoException();
	    } else{
	      this.cpf = cpf;
	    }
	    if(idade <= 0){
	       throw new IdadeInvalidaException();
	    } else{
	       this.idade = idade;
	    } 
	  }

	  public String getNome(){
	    return nome;
	  }

	  public String getCpf(){
	    return cpf;
	  }
	  public int getIdade(){
	    return idade;
	  }
	  
	  @Override
	  public String toString(){
	    return "Nome: " + nome + "\nCPF: " + CpfUtils.formatarCpf(cpf) + "\nIdade: " + idade;
	  }
	}

