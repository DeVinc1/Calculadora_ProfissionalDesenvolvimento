/* Arquivo com todos os comandos SQL utilizados no projeto */

/*
 * Criação da tabela do orçamento do projeto:
 *
 * É necessário alterar o parametros `data_base` para o nome da base de dados conectada para o funcionamento correto do 
 * comando no MySQL e concetenar o nome do projeto ao nome da tabela para torná-la única.
 *
 */
 
CREATE TABLE `data_base`.`orçamento_string` 
      ( `nome_Item` VARCHAR(100) NOT NULL, 
      `complexidade_Item` INT NOT NULL, 
      `tipo_Item` VARCHAR(45) NOT NULL, 
      `horasGastas_Item` INT NOT NULL, 
      `valor_Item` DOUBLE NOT NULL,
      PRIMARY KEY (`ID_item`));
     
     
/*
 * Inserção de dados dentro da tabela
 *
 * É necessário mudar os parâmetros passados em VALUE ou utilizar o comando .setString() no Java
 * para o funcionamento do comando dentro do MySQL
 *
 */
 
 INSERT INTO `data_base`.`orçamento_" + itemDoSistema.getProjetoPai() + "` (`nome_Item`, `complexidade_Item`, `tipo_Item`, `horasGastas_Item`, `valor_Item`) VALUES (?, ?, ?, ?, ?);



 Criando arquivo com os comandos SQL utilizados

Arquivo com os comandos SQL utilizados dentro da classe "MySQL_manipulacao" para integrar o app em Java com o banco de dados MySQL
