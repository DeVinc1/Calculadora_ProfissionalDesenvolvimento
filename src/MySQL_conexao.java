import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL_conexao {

    public Connection conectarBancoDados() {
        Connection conexaoSQL = null;

        try {

            String url = "jdbc:mysql://localhost:3306/data_base?user=root&password=Admin01&serverTimezone=UTC";
            conexaoSQL = DriverManager.getConnection(url);

        } catch (SQLException e) {

            System.out.println("Conexão não foi realizado corretamente, tente novamente mais tarde. \n \nErro: " + e);
        }

        return conexaoSQL;
    }
}