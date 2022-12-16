import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL_manipulacao {

    Connection conexaoSQL;
    PreparedStatement expressaoSQL;

    public void criarTabela(class_itemSistema itemDoSistema) {
        String sqlComando = " CREATE TABLE `data_base`.`orçamento_" + itemDoSistema.getProjetoPai() + "` ( "
                + "`ID_item` INT NOT NULL AUTO_INCREMENT,"
                + "`nome_Item` VARCHAR(100) NOT NULL, "
                + "`complexidade_Item` INT NOT NULL, "
                + "`tipo_Item` VARCHAR(45) NOT NULL, "
                + "`horasGastas_Item` INT NOT NULL, "
                + "`valor_Item` DOUBLE NOT NULL,"
                + "PRIMARY KEY (`ID_item`));";

        conexaoSQL = new MySQL_conexao().conectarBancoDados();

        try {

            expressaoSQL = conexaoSQL.prepareStatement(sqlComando);
            expressaoSQL.execute();
            expressaoSQL.close();

        } catch (SQLException erro) {

            System.out.println("O comando não foi executado corretamente. \n \nErro: " + erro);
        }
    }

    public void cadastrarItem(class_itemSistema itemDoSistema, class_desenvolvedor desenvolvedorDoSistema){
        /* Variável que armazenará os comandos SQL */
        String comandoSQL;

        conexaoSQL = new MySQL_conexao().conectarBancoDados();

        /* Cadastrar nome do item na tabela */
        comandoSQL = "INSERT INTO `data_base`.`orçamento_" + itemDoSistema.getProjetoPai() + "` (`nome_Item`, `complexidade_Item`, `tipo_Item`, `horasGastas_Item`, `valor_Item`) VALUES (?, ?, ?, ?, ?);";

       
    
        try {

            expressaoSQL = conexaoSQL.prepareStatement(comandoSQL);

            expressaoSQL.setString(1, itemDoSistema.getNomeComponente());
            expressaoSQL.setInt(2, itemDoSistema.getDificuldade());
            expressaoSQL.setString(3, itemDoSistema.getTipoComponente());
            expressaoSQL.setInt(4, itemDoSistema.getHorasGastas());
            expressaoSQL.setDouble(5, (itemDoSistema.getHorasGastas() * desenvolvedorDoSistema.calcularValorHora()));
            
            expressaoSQL.execute();
            expressaoSQL.close();

        } catch (SQLException erro) {

            System.out.println("O comando não foi executado corretamente. \n \nErro: " + erro);
        }
    }
}
