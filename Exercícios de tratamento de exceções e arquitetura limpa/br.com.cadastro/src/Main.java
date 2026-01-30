import java.util.Scanner;

import br.com.cadastro.exception.CpfInvalidoException;
import br.com.cadastro.exception.IdadeInvalidaException;
import br.com.cadastro.exception.NomeInvalidoException;
import br.com.cadastro.model.Pessoa;
import br.com.cadastro.service.CadastrarPessoa;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    CadastrarPessoa cadastro = new CadastrarPessoa();
    String nome, cpf;
    int idade;

    for(int i = 0; i < 2; i++){
      System.out.println("Nome: ");
      nome = sc.nextLine();
      System.out.println("CPF: ");
      cpf = sc.nextLine();
      System.out.println("Idade: ");
      idade = sc.nextInt();
      sc.nextLine();
      try{
        Pessoa pessoa = new Pessoa (nome, cpf, idade);
        cadastro.cadastrarPessoa(pessoa);
      } catch(NomeInvalidoException| CpfInvalidoException|IdadeInvalidaException e) {
        System.out.println(e.getMessage());
        i--;
      }
    }
    cadastro.exibirPessoasCadastradas();
    sc.close();
  }
}