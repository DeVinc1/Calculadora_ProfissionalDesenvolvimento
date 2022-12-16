# 🧮 PROJETO - Calculadora de Trabalho de Desenvolvedor

O projeto parte do plano de avaliação A3 foi desenvolvido e documentado por:
 - Marcos Vinícius Pereira Pinto - RA: 822.151.202	

## 💽 Tech Stack

![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

## 📁 A estrutura do projeto

 - `bin` - pasta com as classes binárias criadas pelo Java;
 - `lib` - contém as bibliotecas utilizadas no projeto;
 - `src` - contém os códigos fontes do projeto;
 - `sql` - contém os comandos SQL utilizados no projeto;
 
 ## 📜 Descrição
 
 Com esta calculadora, um programador pode encontrar o preço que deve cobrar em um projeto a partir de suas horas disponíveis diárias e sua pretensão salarial; estruturando-o a partir de categorias pré-definidas com níveis de dificuldade e quantidade de horas por componente já estabelecidos, facilitando a realização de orçamentos e seu armazenamento em um banco de dados MySQL.
    
## ⚠️ Pontos Importantes
No arquivo [MySQL_conexao.java](https://github.com/DeVinc1/Calculadora_ProfissionalDesenvolvimento/blob/main/src/MySQL_conexao.java), na linha 12, a variável `String url`  deve ser alterada para o funcionamento correto do app e sua integração com o banco de dados.

    String  url = "jdbc:mysql://localhost:3306/data_base?user=root&password=Admin01&serverTimezone=UTC";
    

É necessário alterar os parametros:
 -`data_base` para o nome da base de dados local;
 -`user` para o nome de usuário do MySQL local;
 -`password` para a senha do banco de dados MySQL local. 
