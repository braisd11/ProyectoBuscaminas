/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a22braisdr
 */
public class Perfil {
    public String nome;
    public String contrasinal;
    public String estado;
    ArrayList<Perfil> amigos=new ArrayList<Perfil>();
    ArrayList<Perfil> solicitudes=new ArrayList<Perfil>();
    ArrayList<Mensaxe> mensaxes=new ArrayList<Mensaxe>();
    
    
                                            //MÉTODO CONSTRUCTOR
    
    public Perfil (String nome, String contrasinal){
        HashMap<String, String> Perfil=new HashMap<>();
        Perfil.put(nome, contrasinal);
    }

                                            //GETTER E SETTER
    
    public String getNome() {
        return nome;
    }

    public String getContrasinal() {
        return contrasinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
                                                //MÉTODOS
    
    
    //Este método engade ao amigo que introducimos. ACABADO
    public void engadirAmigo (Perfil perfilAmigo){
        amigos.add(perfilAmigo);
    }
    
    
    //Este método envía unha solicitude a un Perfil para que este o engada ao seu array de amigos
    public void engadirSolicitudeDeAmizade (Perfil perfilSolicitante) {
        solicitudes.add(perfilSolicitante);
    }
    
    //Decidimos se aceptamos a solicitude engadida no método engadirSolicitudeDeAmizade
    public void aceptarSolicitudeDeAmizade (Perfil perfilSolicitante){
        engadirAmigo(perfilSolicitante);
        solicitudes.remove(perfilSolicitante);
    }
    
    
    //Decidimos se rexeitamos a solicitude engadida no método engadirSolicitudeDeAmizade
    public void rexeitarSolicitudeDeAmizade (Perfil perfilSolicitante){
        solicitudes.remove(perfilSolicitante);
    }
    
    
    //Engadimos unha mensaxe a outro perfil para que se mostre se o solicita
    public void engadirMensaxePrivada (Mensaxe m){
        mensaxes.add(m);
    }
    
    //Eliminamos unha mensaxe do noso perfil
    public void eliminarMensaxe (Mensaxe m){
        mensaxes.remove(m);
    }
    
    
    public void mostrarMensaxes (Perfil p) {
        for (int cont=0; cont<p.mensaxes.size();cont++){
            System.out.println(p.mensaxes.get(cont));
        }
    }
}
