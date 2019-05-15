package mercadoseuquinkas.control;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import mercadoseuquinkas.dao.CidadeDao;
import mercadoseuquinkas.model.Cidade;
import mercadoseuquinkas.view.PesquisarCidade;

/**
 *
 * @author adriene
 */
public class PesquisarCidadeControl {

    private PesquisarCidade pesquisarCidade;
    private Cidade cidade;
    private List<Cidade> listCidade;
    private PesquisarCidade pesquisarCidades;
    private CidadeDao cidadeDao;

    public PesquisarCidadeControl(PesquisarCidade pesquisarCidades) {
        this.pesquisarCidades = pesquisarCidades;
    }
    public void preencherTabelaCidade(List<Cidade> listCidade){
        listCidade = cidadeDao.listar();
        String [] colunas = {"Nome, UF"};
        DefaultTableModel model = new DefaultTableModel(colunas,listCidade.size());
        
        for(int i = 0; i< listCidade.size();i++){
            Cidade cidade = listCidade.get(i);
            cidade = new Cidade(cidade.getId(),cidade.getNome(),cidade.getUf());
            model.addRow(colunas);
            
            
        }
        
    }

}
