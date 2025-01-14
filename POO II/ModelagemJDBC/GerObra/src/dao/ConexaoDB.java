package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoDB {
    // Design Patterns / Padrões de Projetos
    // Factory / Fabrica
    // Singleton / Unico
    private static ConexaoDB instancia;
    private ConexaoDB(){}

    public synchronized final static ConexaoDB getInstancia(){
        if(instancia == null){
            instancia = new ConexaoDB();
        }
        return instancia;
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:meu_banco.db";
        Connection con = DriverManager.getConnection(url);
        return con;
    }

}
