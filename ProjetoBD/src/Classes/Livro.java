/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
/**
 *
 * @author Matheus
 */
public class Livro{
    private int idLivro;
    private String nomeLivro;
    private String autorLivro;
    private String editoraLivro;
    private int anoPublicacaoLivro;

    public Livro(int idLivro,String nomeLivro,String autorLivro,String editoraLivro,int anoPublicacaoLivro) {
        this.idLivro=idLivro;
        this.nomeLivro=nomeLivro;
        this.autorLivro=autorLivro;
        this.editoraLivro=editoraLivro;
        this.anoPublicacaoLivro=anoPublicacaoLivro;
    }
    public int getIdLivro() {
        return this.idLivro;
    }
    public String getNomeLivro() {
        return this.nomeLivro;
    }
    public String getAutorLivro() {
        return this.autorLivro;
    }
    public String getEditoraLivro() {
        return this.editoraLivro;
    }
    public int getAnoPublicacaoLivro() {
        return this.anoPublicacaoLivro;
    }
}
