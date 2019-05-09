package mercadoseuquinkas.interfaces;

import java.util.List;

public interface DaoI<Cidade> {

    public List<Cidade> listar();

    public List<Cidade> listar(String orderBy, String ordenacao);

    public int cadastrar(Cidade obj);

    public boolean alterar(Cidade obj);

    public boolean deletar(int id);

    public Cidade lerPorId(int id);

    public List<Cidade> pesquisar(String termo);
}
