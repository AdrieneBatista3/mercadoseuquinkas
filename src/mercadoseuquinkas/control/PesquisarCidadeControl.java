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

}
