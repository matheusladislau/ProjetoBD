/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 *
 * @author Matheus
 */
public class GerenciadorBD{
    String banco = "test";
    /**
    * Insere 'Pessoa' no banco de dados
    * @param p refere-se a instancia de pessoa a ser inserida
    * @return true- inserção concluída. false-inserção não realizada 
    */
    public boolean insert(Pessoa p) {
        String comando = "INSERT INTO Pessoa VALUES ";
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, "root", "");
            PreparedStatement stm=(PreparedStatement) connection.prepareStatement(comando
                +"("+(MaxIdPessoa()+1)+ ",'" + p.getNome() + "');");
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public int MaxIdPessoa(){
        int resultado=0;
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT MAX(idPessoa) FROM Pessoa;");
            ResultSet rs=stm.executeQuery();
        while(rs.next()){
            resultado=rs.getInt("max(idPessoa)");
        }
            return resultado;
        }catch(Exception e) {
            return 1;
        }
    }
}
