# Pasta de Estudos em Java

## Descrição
Esta pasta contém exemplos de códigos em Java de nivel basico, cada um ilustrando diferentes conceitos e funcionalidades da linguagem. Os exemplos incluem gerenciamento de argumentos de linha de comando, simulação de uma Smart TV e manipulação de tipos primitivos e operadores.

## Estrutura do Projeto
- **arguments**
  - **AboutMe.java**: Demonstra como receber e utilizar argumentos passados pela linha de comando.
- **method_project**
  - **SmartTV.java**: Define uma classe Smart TV com métodos para ligar, desligar, mudar de canal e ajustar o volume.
  - **User.java**: Simula um usuário interagindo com a Smart TV.
- **type_andOperator**
  - **Estoque.java**: Demonstra o uso de tipos primitivos e operadores básicos para gerenciar informações sobre um produto em estoque.

## Como Executar

### Compilação
1. Abra o terminal ou prompt de comando.
2. Navegue até o diretório onde os arquivos Java estão localizados.
3. Compile os arquivos com os comandos apropriados para cada projeto.

### Execução
1. Após a compilação, execute os arquivos .class gerados com os comandos apropriados para cada projeto.

#### Exemplo para `AboutMe`
1. Compile:
   ```sh
   javac arguments/AboutMe.java
   ```
2. Execute:
   ```sh
   java arguments.AboutMe <nome> <idade> <altura> <pet>
   ```
   Exemplo:
   ```sh
   java arguments.AboutMe "João" 25 180.5 "Rex"
   ```

#### Exemplo para `SmartTV`
1. Compile:
   ```sh
   javac method_project/SmartTV.java method_project/User.java
   ```
2. Execute:
   ```sh
   java method_project.User
   ```

#### Exemplo para `Estoque`
1. Compile:
   ```sh
   javac type_andOperator/Estoque.java
   ```
2. Execute:
   ```sh
   java type_andOperator.Estoque
   ```

## Funcionalidades

### `AboutMe.java`
- **Descrição**: Recebe e utiliza argumentos passados pela linha de comando para exibir informações sobre uma pessoa.
- **Exemplo de Saída**:
  ```
  Oie! me chamo Karine
  Tenho 25 anos
  Minha altura é 1.69 cm
  E um bichinho de estimação muito fofo chamado Bentinho
  ```

### `SmartTV.java` e `User.java`
- **Descrição**: Simula uma Smart TV com métodos para ligar, desligar, mudar de canal e ajustar o volume.
- **Exemplo de Saída**:
  ```
  TV Ligada? false
  Canal Atual: 1
  Volume Atual: 25
  ```

### `Estoque.java`
- **Descrição**: Demonstra o uso de tipos primitivos e operadores básicos para gerenciar informações sobre um produto em estoque.
- **Exemplo de Saída**:
  ```
  Detalhes do Produto:
  Nome: Gadget
  ID do Produto: 123456
  Código de Barras: 123456789012
  Quantidade em Estoque: 100
  Número do Armazém: 32
  Peso: 1.5 kg
  Preço: $99.99
  Em Estoque: true
  Valor Total em Estoque: $9999.0
  ```

## Contribuição
Se você gostaria de contribuir com este projeto, sinta-se à vontade para abrir um pull request ou relatar issues no repositório do GitHub.

## Contato
Para dúvidas ou sugestões, você pode entrar em contato comigo através do meu [LinkedIn](https://www.linkedin.com/karine-queiroz76).

---

Se precisar de mais alguma coisa ou ajustes, me avise!