/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static clases.Servei.llistaServeis;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Treballador implements Serializable{
    static ArrayList<Treballador> treballadors = new ArrayList();
    private int _id;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String login;
    private String password;
    private int esAdmin;
    private List<Servei> llistaServeis = new ArrayList();
    
    public Treballador(){
        
    }

    public Treballador(int _id, String nom, String cognom1, String cognom2, String login, String password, int esAdmin, List<Servei> llista) {
        this._id = _id;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.login = login;
        this.password = password;
        this.esAdmin = esAdmin;
        this.llistaServeis = llista;
    }

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cognom1
     */
    public String getCognom1() {
        return cognom1;
    }

    /**
     * @param cognom1 the cognom1 to set
     */
    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    /**
     * @return the cognom2
     */
    public String getCognom2() {
        return cognom2;
    }

    /**
     * @param cognom2 the cognom2 to set
     */
    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the esAdmin
     */
    public int getEsAdmin() {
        return esAdmin;
    }

    /**
     * @param esAdmin the esAdmin to set
     */
    public void setEsAdmin(int esAdmin) {
        this.esAdmin = esAdmin;
    }

    /**
     * @return the llistaServeis
     */
    public List<Servei> getLlistaServeis() {
        return llistaServeis;
    }

    /**
     * @param llistaServeis the llistaServeis to set
     */
    public void setLlistaServeis(List<Servei> llistaServeis) {
        this.llistaServeis = llistaServeis;
    }
    
    public static ArrayList<Treballador> getTreballadors() {
        return treballadors;
    }

    public static void setTreballadors(Treballador treballador) {
        Treballador.treballadors.add(treballador);
    }
    public String toString() {
        return "Treballador: " + nom + "  " + cognom1 + "  " + cognom2;
    }

}
