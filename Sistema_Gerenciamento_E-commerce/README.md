# 🛒 Sistema de Gerenciamento de E-commerce (POO em Java)

Este projeto foi desenvolvido com o objetivo de praticar os pilares fundamentais da Orientação a Objetos (POO) em Java, simulando o backend de um carrinho de compras de e-commerce com regras de negócio para produtos físicos e digitais.

---

## 🚀 Conceitos Técnicos Aplicados

O foco principal deste desafio foi estruturar uma arquitetura de código limpa e escalável, aplicando os seguintes conceitos:

*   **Abstração e Herança:** Criação de uma classe base genérica para `Produto` e especialização em subclasses (`ProdutoFisico` e `ProdutoDigital`) para reaproveitamento de código.
*   **Polimorfismo (@Override):** Sobrescrita do método de cálculo de preço final de acordo com a regra de negócio de cada tipo de produto (cálculo de frete por peso vs. isenção para produtos digitais).
*   **Composição:** Associação entre classes onde um `ItemCarrinho` *contém* um `Produto`, e um `CarrinhoDeCompras` *contém* uma lista de itens.
*   **Upcasting:** Utilização da tipagem da classe mãe (`Produto`) na composição do carrinho, permitindo que a aplicação manipule dinamicamente tanto produtos físicos quanto digitais de forma transparente.
*   **Princípio da Responsabilidade Única (SRP):** Separação estrita de responsabilidades, isolando a lógica matemática de cálculo de totais em métodos específicos (`calcularTotalGeral`) e deixando o método de exibição apenas responsável pela saída de dados.
*   **Manipulação de Coleções:** Uso de `List` e `ArrayList` para o gerenciamento dinâmico dos itens adicionados ao carrinho.

---

## 🛠️ Regras de Negócio Implementadas

1.  **Produto Físico:** Possui peso em kg. O preço final é calculado somando o preço base ao valor do frete (`peso * R$ 5,00`).
2.  **Produto Digital:** Possui link de download e tamanho em MB. Não possui custo de frete (o preço final é igual ao preço base).
3.  **Carrinho de Compras:** Calcula automaticamente o subtotal de cada item (multiplicando a quantidade pelo preço final polimórfico) e acumula o total geral do pedido.

---

## 💻 Exemplo de Saída no Console

Ao executar o método `main`, o sistema processa os itens e gera o seguinte resumo de compra:

```text
=== RESUMO DO CARRINHO ===
Cliente: Érica Victória
--------------------------
- Cadeira Gamer (Físico) | Qtd: 1 | Preço Unitário: R$ 575.0 | Subtotal: R$ 575.0
- Curso de Java (Digital) | Qtd: 2 | Preço Unitário: R$ 150.0 | Subtotal: R$ 300.0
--------------------------
TOTAL GERAL A PAGAR: R$ 875.0
