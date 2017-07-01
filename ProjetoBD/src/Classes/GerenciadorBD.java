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
    * Insere instância de 'Pessoa' no banco de dados
    * @param p refere-se a instância de Pessoa a ser inserida
    * @return true: inserção concluída com sucesso. false: inserção não realizada 
    */
    public boolean insert(Pessoa p) {
        String comando = "INSERT INTO Pessoa VALUES ";
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, "root", "");
            PreparedStatement stm=(PreparedStatement) connection.prepareStatement(comando
                +"("+p.getIdPessoa()+ ",'" + p.getNome() + "');");
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Insere instância de 'Telefone' no banco de dados
     * @param t refere-se a instância de Telefone a ser inserida
     * @return true: inserção concluída com sucesso. false: inserção não realizada 
     */
    public boolean insert(Telefone t){
        String comando="INSERT INTO Telefone VALUES ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+
            "("+t.getIdTelefone()+","+t.getIdPessoa()+",'"+t.getNumero()+"');"); 
            stm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
//
    /**
     * Retorna o maior ID de pessoa já inserida
     * @return o valor do maior ID de Pessoa já inserida
     */
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
    /**
     * Retorna o maior ID de Teleone já inserida
     * @return o valor do maior ID de Pessoa já inserida
     */
    public int MaxIdTelefone(){
        int resultado=0;
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT MAX(idTelefone) FROM Telefone;");
            ResultSet rs=stm.executeQuery();
        while(rs.next()){
            resultado=rs.getInt("max(idTelefone)");
        }
            return resultado;
        }catch(Exception e) {
            return 1;
        }
    }
    
    
    
    
    
    
    public String selectNomePessoa(int idPessoa){
        String resultado="ID: "+idPessoa+" || Nome: ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Pessoa WHERE idPessoa="+idPessoa+";"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+=rs.getString("nomePessoa");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
    
}
//delete from Pessoa where idPessoa<100;

/*
CREATE TABLE IF NOT EXISTS Pessoa(
	idPessoa INT NOT NULL,
	nomePessoa varchar(90) NOT NULL,
	
CONSTRAINT pk_pessoa PRIMARY KEY(idPessoa)
);
 
CREATE TABLE IF NOT EXISTS Telefone(
	idTelefone INT NOT NULL,
	idPessoa INT NOT NULL,
	numero VARCHAR(20) NOT NULL,
	CONSTRAINT pk_pessoa PRIMARY KEY  (idTelefone),	
	CONSTRAINT fk_pessoa_telefone
FOREIGN KEY (idPessoa)
REFERENCES Pessoa(idPessoa)
);
*/

/*
            stm= (PreparedStatement) connection.prepareStatement("INSERT INTO Telefone VALUES "+
                                                                //"(?,?);");
                                                                //stm.setInt(1,1);
                                                                //stm.setString(2,"Matheus Ladislau")
                                                                "(1,1,'(12)98484-8484');");
            stm.execute();
           */

