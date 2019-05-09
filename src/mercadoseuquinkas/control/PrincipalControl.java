package mercadoseuquinkas.control;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercadoseuquinkas.view.CadastroCategoria;
import mercadoseuquinkas.view.CadastroCliente;
import mercadoseuquinkas.view.CadastroProduto;
import mercadoseuquinkas.view.ListarClientes;
import mercadoseuquinkas.view.Principal;
import mercadoseuquinkas.view.TelaAjuda;
import mercadoseuquinkas.view.TelaSobre;

public class PrincipalControl {

    private CadastroCliente telaCadastroCliente = null;
    private CadastroCategoria cadastroCategoria = null;
    private CadastroProduto cadastroProduto = null;
    private ListarClientes listarClientes = null;

    public void chamarTelaCadastrarClienteAction() {
        if (telaCadastroCliente == null) {
            telaCadastroCliente = new CadastroCliente();
            Principal.dpPrincipal.add(telaCadastroCliente);
            telaCadastroCliente.show();

        } else if (telaCadastroCliente.isIcon()) {
            try {
                telaCadastroCliente.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!telaCadastroCliente.isShowing()) {
            Principal.dpPrincipal.add(telaCadastroCliente);
            telaCadastroCliente.show();

        }

    }

    public void chamarTelaSobre() {
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

    }

    public void chamarTelaAjuda() {
        TelaAjuda ajuda = new TelaAjuda();
        ajuda.setVisible(true);
    }

    public void chamarTelaCadastroCategoria() {
        if (cadastroCategoria == null) {
            cadastroCategoria = new CadastroCategoria();
            Principal.dpPrincipal.add(cadastroCategoria);
            cadastroCategoria.show();

        } else if (cadastroCategoria.isIcon()) {
            try {
                cadastroCategoria.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!cadastroCategoria.isShowing()) {
            Principal.dpPrincipal.add(cadastroCategoria);
            cadastroCategoria.show();

        }
    }

    public void chamarTelaCadastroProduto() {
        if (cadastroProduto == null) {
            cadastroProduto = new CadastroProduto();
            Principal.dpPrincipal.add(cadastroProduto);
            cadastroProduto.show();

        }else if(cadastroProduto.isIcon()){
            try {
                cadastroProduto.setIcon(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(!cadastroProduto.isShowing()){
            Principal.dpPrincipal.add(cadastroProduto);
            cadastroProduto.show();
        }

    }
    
    public void chamarTelaListarClientes(){
        if (listarClientes == null) {
            listarClientes = new ListarClientes();
            Principal.dpPrincipal.add(listarClientes);
            listarClientes.show();

        }else if(listarClientes.isIcon()){
            try {
                listarClientes.setIcon(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(!listarClientes.isShowing()){
            Principal.dpPrincipal.add(listarClientes);
            listarClientes.show();
        }
        
    }
    
    public void chamarManual(){
        
    }
    
    public void chamarTelaManual(){
        
        
    }

}
