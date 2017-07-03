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
public class LivroEmprestimo{
    private int idEmprestimo;
    private int idLivro;
    public LivroEmprestimo(int idEmprestimo,int idLivro){
        this.idEmprestimo = idEmprestimo;
        this.idLivro = idLivro;
    }
    public int getIdEmprestimo() {
        return this.idEmprestimo;
    }
    public int getIdLivro() {
        return this.idLivro;
    }
}
