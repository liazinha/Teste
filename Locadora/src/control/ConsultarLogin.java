/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import view.Menu;
import model.Funcionario;
/**
 *
 * @author csouza
 */
public class ConsultarLogin {
    public boolean logar(String usr, String pwd){
        boolean resultado = true;
        Funcionario func = new Funcionario();
        Menu men = new Menu();
        if(usr.equalsIgnoreCase("clem")){
            func.setNome("Clemilton");
            resultado = true;
        }else if(!usr.equalsIgnoreCase("")){
            func.setNome(usr);
            resultado = true;
        }else{
            resultado = false;
        }
        men.nomeFuncionario(func);
        men.setVisible(true);
        
        return resultado;
    }
}
