package mercadoseuquinkas.dao;

import java.sql.Connection;
import mercadoseuquinkas.factory.Conexao;

public class Dao {

    protected Connection conexao;

    public Dao() {
        conexao = Conexao.getConexao();
    }

}
