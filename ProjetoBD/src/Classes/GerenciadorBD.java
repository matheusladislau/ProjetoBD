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
    String banco = "matheusBiblioteca";
    
//DELETE
    /**
     * Remove Livro do banco de dados
     * @param idLivro refere-se ao id do Livro a ser removido
     * @return True- Livro removido com sucesso. False- Livro não removido
     */
    public boolean deleteLivro(int idLivro){
        String comando="DELETE FROM Livro WHERE ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+"idLivro="+idLivro+";");            
            stm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    /**
     * deleta instância de 'Emprestimo' no banco de dados
     * @param idLivro
     * @return True: livro deletado do banco de dados com sucesso. False: Livro não deletado do banco dados
     */
    public boolean deleteLivroEmprestimo(int idLivro){
        String comando="DELETE FROM LivroEmprestimo WHERE ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+"idLivro="+idLivro+";");            
            stm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

//INSERT
    /**
     * Insere instância de 'Emprestimo' no banco de dados
     * @param emp refere-se à instância de Emprestimo a ser inserida
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
     * Insere uma instância de 'LivroEmprestimo' no banco de dados
     * @param le refere-se à instância de LivroEmprestimo a ser inserida
     * @return true: inserção concluída com sucesso. false: inserção não realizada 
     */
    public boolean insert(LivroEmprestimo le){
        String comando="INSERT INTO LivroEmprestimo VALUES ";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement(comando+
            "("+le.getIdEmprestimo()+","+le.getIdLivro()+");");            
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
    
//MAX
    /**
     * Retorna o maior ID de Emprestimo já inserido no banco de dados
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
     * Retorna o maior ID de Livro já inserido no banco de dados
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
     * Retorna o maior ID de Teleone já inserido no banco de dados
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
     * Retorna o maior ID de Pessoa já inserida no banco de dados
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
    
//SELECT
    /**
     * Consulta no banco de dados o livro com o id informado
     * @param idLivro id do Livro e a ser buscado
     * @return Informações referentes ao livro encontrado.
     */
    public String selectLivro(int idLivro){
        String resultado="Resultados para a consulta:\n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Livro WHERE idLivro="+idLivro+";"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID Livro: "+rs.getString("idLivro")+" || ";
                resultado+=rs.getString("nomeLivro")+" || ";
                resultado+="Autor: "+rs.getString("autorLivro")+", ";
                resultado+="editora "+rs.getString("editoraLivro")+", ";
                resultado+=rs.getString("anoPublicacao")+"\n";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
    /**
     *Consulta no banco de dados os Livros que constam o texto informado 
     * @param busca Palavra ou parte a ser consultada nas informações de Livro
     * @return Informações referentes ao livro encontrado.
     */
    public String selectLivro(String busca){
        String resultado="Resultados para a consulta:\n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Livro WHERE nomeLivro LIKE '%"+busca+"%' OR "
                                                                +"autorLivro LIKE '%"+busca+"%' OR editoraLivro LIKE '%"+busca+"%' ;"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID Livro: "+rs.getString("idLivro")+" || ";
                resultado+=rs.getString("nomeLivro")+" || ";
                resultado+="Autor: "+rs.getString("autorLivro")+", ";
                resultado+="editora "+rs.getString("editoraLivro")+", ";
                resultado+=rs.getString("anoPublicacao")+"\n";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
    /**
    * Retorna Livro 'não devolvidos' referente a Pessoa consultada 
    * @param idPessoa id de Pessoa a ser consultada
    * @return Livros relacionados a Emprestimo com devolvido=false e relacionados ao idPessoa pesquisado
    */
    public String selectLivrosNaoDevolvidos(int idPessoa){
        String resultado="Livros a serem devolvidos pelo usuário "+idPessoa+":\n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Pessoa NATURAL JOIN Emprestimo NATURAL JOIN LivroEmprestimo NATURAL JOIN Livro WHERE idPessoa="+idPessoa+" AND devolvido = 0;"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID Livro: "+rs.getString("idLivro")+", ";
                resultado+=rs.getString("nomeLivro")+" || ";
                resultado+="Data empréstimo: "+rs.getString("dataEmprestimo")+", ";
                resultado+="Data devolução "+rs.getString("dataDevolucao")+".\n";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
    /**
     * Retorna o nome da Pessoa respectiva ao id
     * @param idPessoa refere-se ao id da pessoa a ser buscada
     * @return nome da Pessoa a ser buscada
     */
    public String selectPessoa(int idPessoa){
        String resultado="Resultados para a consulta:\n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Pessoa WHERE idPessoa="+idPessoa+";"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID: "+rs.getString("idPessoa")+". ";
                resultado+=rs.getString("nomePessoa")+" | ";
                resultado+="Endereço: "+rs.getString("endereco")+", ";
                resultado+=rs.getString("bairro")+". ";
                resultado+="Email: "+rs.getString("email")+"\n";
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
    public String selectPessoa(String nomePessoa,String email,String bairro){
        String resultado="Resultados para a consulta:\n\n";
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco,"root","");
            PreparedStatement stm=(PreparedStatement)connection.prepareStatement("SELECT * FROM Pessoa WHERE nomePessoa LIKE '%"+nomePessoa+"%' AND "
                                                                                +"email LIKE '%"+email+"%' AND bairro LIKE '%"+bairro+"%';"); 
            ResultSet rs;
            rs=stm.executeQuery();
            while(rs.next()){
                resultado+="ID: "+rs.getString("idPessoa")+". ";
                resultado+=rs.getString("nomePessoa")+" | ";
                resultado+="Endereço: "+rs.getString("endereco")+", ";
                resultado+=rs.getString("bairro")+". ";
                resultado+="Email: "+rs.getString("email")+"\n";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }
    
//UPDATE
    /**
     * Realiza atualização de 'email' de 'Pessoa' no banco de dados
     * @param idPessoa refere-se ao 'idPessoa' da 'Pessoa' a ser alterada
     * @param email refere-se ao novo 'email' de 'Pessoa' que será configurado
     * @return True: update realizado com sucesso no banco de dados.False:update não realizado
     */
    public boolean updateEmailPessoa(int idPessoa,String email) {
        String comando="UPDATE Pessoa SET ";
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, "root", "");            
            PreparedStatement stm=(PreparedStatement) connection.prepareStatement(comando
                                                            +"email ='"+email+"' WHERE idPessoa="+idPessoa+";");
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Realiza atualização de 'endereco' de 'Pessoa' no banco de dados
     * @param idPessoa refere-se ao 'idPessoa' da 'Pessoa' a ser alterada
     * @param endereco refere-se ao novo 'endereco' de 'Pessoa' que será configurado
     * @return True: update realizado com sucesso no banco de dados.False:update não realizado
     */
    public boolean updateEnderecoPessoa(int idPessoa,String endereco) {
        String comando="UPDATE Pessoa SET ";
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, "root", "");            
            PreparedStatement stm=(PreparedStatement) connection.prepareStatement(comando
                                                            +"endereco ='"+endereco+"' WHERE idPessoa="+idPessoa+";");
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Realiza atualização de 'bairro' de 'Pessoa' no banco de dados
     * @param idPessoa refere-se ao 'idPessoa' da 'Pessoa' a ser alterada
     * @param bairro refere-se ao novo 'bairro' de 'Pessoa' que será configurado
     * @return True: update realizado com sucesso no banco de dados.False:update não realizado
     */
    public boolean updateBairroPessoa(int idPessoa,String bairro) {
        String comando="UPDATE Pessoa SET ";
        try {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, "root", "");            
            PreparedStatement stm=(PreparedStatement) connection.prepareStatement(comando
                                                            +"endereco ='"+bairro+"' WHERE idPessoa="+idPessoa+";");
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
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