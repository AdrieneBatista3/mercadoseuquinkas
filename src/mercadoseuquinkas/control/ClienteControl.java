package mercadoseuquinkas.control;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import mercadoseuquinkas.dao.CidadeDao;
import mercadoseuquinkas.dao.ClienteDao;
import mercadoseuquinkas.model.Cidade;
import mercadoseuquinkas.model.Cliente;
import mercadoseuquinkas.uteis.Conversor;
import mercadoseuquinkas.view.CadastroCliente;

public class ClienteControl {

    private Cliente cliente;
    private List<Cliente> listclientes;
    private ClienteDao clienteDao;
    private CadastroCliente telaCadastro;

    private List<Cidade> listCidades;
    private CidadeDao cidadeDao;

    public ClienteControl(CadastroCliente telaCadastro) {
        this.telaCadastro = telaCadastro;
        clienteDao = new ClienteDao();
        cidadeDao = new CidadeDao();
        carregarCidades();
    }

    private void carregarCidades() {
        listCidades = cidadeDao.listar();
        DefaultComboBoxModel<Cidade> model = new DefaultComboBoxModel(listCidades.toArray());
        CadastroCliente.obCidade.setModel(model);

    }

    public void cadastrarAction() {
        cliente = new Cliente();
        cliente.setNome(CadastroCliente.tfNome.getText());
        cliente.setCep(CadastroCliente.tfCep.getText());
        cliente.setDataNascimento(Conversor.dataUsuarioParaBanco(CadastroCliente.tfNascimento.getText()));
        cliente.setCidade((Cidade) CadastroCliente.obCidade.getSelectedItem());

        //Cadastrar o cliente
        int newIdCliente = clienteDao.cadastrar(cliente);
        if (newIdCliente > 0) {
            cliente.setId(newIdCliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        cliente = null;
    }

    private void limparFormulario() {
        CadastroCliente.tfCep.setText("");
        CadastroCliente.tfNascimento.setText("");
        CadastroCliente.tfCep.setText("");
        CadastroCliente.obCidade.setSelectedIndex(-1);
    }
}
