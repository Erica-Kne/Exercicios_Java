package br.com.cadastro.service;

import br.com.cadastro.model.Pessoa;

public class CadastrarPessoa {
		  private Pessoa [] pessoas = new Pessoa[2];

		  public void cadastrarPessoa(Pessoa pessoa){
		    for(int i = 0; i < pessoas.length; i++){
		      this.pessoas[i] = pessoa;
		    }
		  }

		  public void exibirPessoasCadastradas(){
		    for(int i = 0; i < pessoas.length; i++){
		      System.out.println(pessoas[i]);
		      System.out.println("--------------------------------");
		    }
		    
		  }

}
