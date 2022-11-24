/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

/**
 *
 * @author a22braisdr
 */
public class Mensaxe {
    //data debería ser de tipo date pero non sabemos como
    String data;
    String texto;
    boolean lido;
    
    public Mensaxe (String texto, Perfil remitente){
        //Podería ir data pero non sabemos

    }

                                        //GETTER E SETTER
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
                                        //MÉTODOS
    
    
    
    
    
}
