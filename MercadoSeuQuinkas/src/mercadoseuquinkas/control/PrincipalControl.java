/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadoseuquinkas.control;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mercadoseuquinkas.view.CadastroCliente;
import mercadoseuquinkas.view.Principal;

/**
 *
 * @author renato.dasilva
 */
public class PrincipalControl {
    private CadastroCliente telaCadastroCliente = null;
    public void chamarTelaCadastrarClienteAction(){
        if(telaCadastroCliente == null){
            telaCadastroCliente = new CadastroCliente();
            Principal.dpPrincipal.add(telaCadastroCliente);
            telaCadastroCliente.show();
        } else if(telaCadastroCliente.isIcon()){
            try {
                telaCadastroCliente.setIcon(false);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(PrincipalControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(!telaCadastroCliente.isShowing()) {
            Principal.dpPrincipal.add(telaCadastroCliente);
            telaCadastroCliente.show();
        }
    }
}