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
    String banco = "mydb";
    /**
     * Insere instância de 'Emprestimo' no banco de dados
     * @param emp refere-se a instância de Emprestimo a ser inserida
     * @return true: inserção concluída com sucesso. false: inserção não realizada 
     */
    public boolean insert(Emprestimo emp){
        String comando="INSERT INTO Emprestimo VALUES ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+
            "("+emp.getIdEmprestimo()+","+emp.getIdPessoa()+",'"+emp.getDataEmprestimo()+"','"+emp.getDataDevolucao()+"',"+emp.isDevolvido()+")");            
            
            stm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Insere instância de 'Livro' no banco de dados
     * @param l refere-se a instância de Livro a ser inserida
     * @return true: inserção concluída com sucesso. false: inserção não realizada 
     */
    public boolean insert(Livro l){
        String comando="INSERT INTO Livro VALUES ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+
            "("+l.getIdLivro()+",'"+l.getNomeLivro()+"','"+l.getAutorLivro()+"','"+l.getEditoraLivro()+"',"+l.getAnoPublicacaoLivro()+")");            
            
            stm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
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
                +"("+p.getIdPessoa()+",'"+p.getNomePessoa()+"','"+p.getEmail()+"','"+p.getEndereco()+"','"+p.getBairro()+"');");
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
     * Retorna o maior ID de Emprestimo já inserido
     * @return o valor do maior ID de Emprestimo já inserido
     */
    public int MaxIdEmprestimo(){
        int resultado=0;
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT MAX(idEmprestimo) FROM Emprestimo;");
            ResultSet rs=stm.executeQuery();
        while(rs.next()){
            resultado=rs.getInt("max(idEmprestimo)");
        }
            return resultado;
        }catch(Exception e) {
            return 1;
        }
    }
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
     * Retorna o maior ID de Teleone já inserido
     * @return o valor do maior ID de Telefone já inserido
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
    /**
     * Retorna o maior ID de Livro já inserido
     * @return o valor do maior ID de Livro já inserido
     */
    public int MaxIdLivro(){
        int resultado=0;
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT MAX(idLivro) FROM Livro;");
            ResultSet rs=stm.executeQuery();
        while(rs.next()){
            resultado=rs.getInt("max(idLivro)");
        }
            return resultado;
        }catch(Exception e) {
            return 1;
        }
    }
    /**
     * Retorna o nome da Pessoa respectiva ao id
     * @param idPessoa refere-se ao id da pessoa a ser buscada
     * @return nome da Pessoa a ser buscada
     */
    public String selectNome(int idPessoa){
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
    /**
     * Realiza busca no banco de dados que contém os dados inseridos
     * @param nomePessoa referente ao nome da Pessoa
     * @param email referente ao email da Pessoa
     * @param bairro referente ao bairro da Pessoa
     * @return retorna os valores no banco de dados referentes ao resultado da busca
     */
    public String selectLikeNomeEmailBairro(String nomePessoa,String email,String bairro){
        String resultado="Resultados para a consulta: '"+nomePessoa+"' \n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Pessoa WHERE nomePessoa LIKE '%"+nomePessoa+"%' AND "
                                                                                +"email LIKE '%"+email+"%' AND bairro LIKE '%"+bairro+"%';"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID Pessoa: "+rs.getString("idPessoa")+"|| ";
                resultado+="Nome: "+rs.getString("nomePessoa")+"||";
                resultado+="Email: "+rs.getString("email")+"\n";
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

/*
//dia: '2017-07-01'
    CREATE TABLE DIA (
        ddd DATE
);
*/