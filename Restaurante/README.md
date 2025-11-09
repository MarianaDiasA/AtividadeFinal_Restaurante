## Aplicação dos Padrões GRASP

Este projeto foi desenvolvido como atividade final da disciplina de Programação Orientada a Objetos

O objetivo é demonstrar a aplicação prática de dois princípios GRASP em um sistema simples.

---

## Padrões GRASP Implementados

Utilizei o cenário de um sistema de pedidos de restaurante para ilustrar o fluxo de responsabilidades. Os padrões implementados são:

### 1. Controller (Controlador)

**Classe Aplicada:** `GerenteController`

**Justificativa GRASP:**
* A classe `GerenteController` atua como o **intermediário** entre a entrada do sistema (simulada pelo `Garcom`) e a lógica de negócio do domínio.
* O Gerente coordena as ações de iniciar pedido, finalizar pedido, mas delega a execução das tarefas para o `Cozinheiro` e `Caixa`.
* Esta centralização de controle dos eventos de sistema reduz o acoplamento do sistema.

### 2. Creator (Criador)

**Classes/Métodos Aplicados:**
* Construtor da classe `Pedido` (criação da lista interna de itens).
* Método `GerenteController.adicionarPrato()` (criação da instância de `Prato`).

**Justificativa GRASP:**
* Creator atribui a responsabilidade de criar um objeto ao objeto que o agrega, contém ou tem os dados necessários para sua inicialização.
* `Pedido`: Cria sua lista interna (`List<Prato>`) porque a contém/agrega.
* `GerenteController`: Cria a instância de `Prato` porque, ao receber a chamada do `Garcom`, ele possui os dados de inicialização (nome e preço) no momento da criação.

---

##  Estrutura do Projeto

O código simula o fluxo de um pedido seguindo as responsabilidades claras definidas pelos padrões GRASP e a analogia do restaurante vista em aula:

| Classe | Responsabilidade Principal |
| :--- | :--- |
| **`Garcom`** | Simula a interface de entrada e interage *apenas* com o `GerenteController`. |
| **`GerenteController`** | **Controller:** Coordena e delega as tarefas. **Creator:** Cria instâncias de `Prato`. |
| **`Pedido`** | **Creator:** Cria sua lista de itens. **Information Expert:** Sabe calcular seu próprio total. |
| **`Prato`** | Representa o item do menu. |
| **`Cozinheiro`** | Especialista em preparar o `Pedido`. |
| **`Caixa`** | Especialista em calcular e registrar a cobrança do `Pedido`. |

---

## Como Executar

O projeto é um aplicação Java simples (console).

1.  Salve todas as classes (`Garcom.java`, `Pedido.java`, `GerenteController.java`, etc.) no mesmo diretório `src`.
2.  Compile todas as classes .java
3.  Execute a classe principal Main
