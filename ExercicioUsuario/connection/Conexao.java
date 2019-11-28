package ExercicioUsuario.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//classe usuario que esta na pasta de fora precisa ser importada aqui
import ExercicioUsuario.Usuario;

//inicia a classe de conexao
public class Conexao {
    // instancia uma connection e diz que pode haver erros sql
    public static Connection getConnection() throws Exception {
        try {
            // cria uma variavel do tipo propriedade
            //Properties props = getProps();
            
            // informa a ulr de conexãoo com o banco
            final String url = "jdbc:mysql://localhost:3306/bancojackson";
            //final String url = props.getProperty("banco.url");

            //informa o usuario que sera usado para acessar o banco
            final String user = "root";
            //final String user = props.getProperty("banco.usuario");

            //informa a senha do usuario que sera usado para acessar o banco
            final String password = "";
            //final String password = props.getProperty("banco.senha");

            //realiza a conexão com o banco
            return DriverManager.getConnection(url, user, password);
        

        } catch (SQLException /*| IOException*/ e) {
            // se der erro sql ou outro é mostrado aqui
            throw new RuntimeException(e);
        }
    }
 /*
    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        String path = "/exercicios/bancodedados/conexao.properties";
        props.load(Conexao.class.getResourceAsStream(path));
        return props;
    }
*/
    // criado o metodo para cria usuarios - onde é passada a conexoa com o banco, e os atributos para cadastro
    public static void createUser(Connection conexao, String userName, String password, String nome) throws Exception {
        // criada a query para inserir
        String sql = "INSERT INTO usuario (user_name, password, name) VALUES(?,?,?)";
        //
        try{
            // avisa para o banco que havera uma passagem de query - tipo um instanciamento da query
            PreparedStatement statement = conexao.prepareStatement(sql);
            // substitui o primeiro ? da query pelo user name
            statement.setString(1, userName);
            // substitui o segundo ? da query pela senha
            statement.setString(2, password);
            // substitui o terceiro ? da query pelo nome do usuario
            statement.setString(3, nome);
            // executa a query de insersão do usuario no banco
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    /*
    public static void updateUser(
        Connection conexao,
        int id, 
        String password
    ) throws Exception {
        String sql = "UPDATE usuario " + 
                        "SET password = ?" + 
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, password);
            statement.setInt(2, id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void removeUser(
        Connection conexao,
        int id
    ) throws Exception {
        String sql = "DELETE FROM usuario " + 
                    "WHERE id = ?";
        try{
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    */
    // criando um metodo para pegar os usuarios do banco e criar os objetos de usuario no programa
    public static void findUser(Connection conexao) throws Exception {
        
        // query para buscar os dados
        String sql = "SELECT * FROM usuario";
        // diz pro banco que havera uma execução de uma query
        Statement statemente = conexao.createStatement();
        // executa a query criada anteriormente
        ResultSet resultados = statemente.executeQuery(sql);

        // o retorno dessa execução sera uma resultset(separado por linha) logo é feito o while para criar enquanto houver linha
        while(resultados.next()){
            // cria um novo usuario de acordo com o resultset de resultados
            Usuario user = new Usuario(
                // getint diz para pegar um inteiro do id que retornou do banco
                resultados.getInt("idusuario"),
                // getstring diz para pegar uma string do user name que retornou do banco
                resultados.getString("username"),
                // getstring diz para pegar uma string do passworld que retornou do banco
                resultados.getString("password"),
                // getstring diz para pegar uma string do name que retornou do banco
                resultados.getString("name")
            );
            //
            System.out.println(user);
        }

        
    }
}