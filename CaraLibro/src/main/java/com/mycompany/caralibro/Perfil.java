/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibro;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import javax.management.MBeanRegistrationException;

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
        System.out.println("Tes unha solicitude de: " + );
    }
}
