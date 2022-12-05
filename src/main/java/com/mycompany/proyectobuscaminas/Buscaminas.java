/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobuscaminas;

/**
 *
 * @author a22braisdr
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Buscaminas {
    int fila=6;
    int columna=6;
    int modo;
    boolean fin=false;
    int minas;
    private int [][] xogo=new int [fila][columna];

    
    //Método Constructor
    
    public Buscaminas (){
        
    }
    
    //Getter e Setter
    
    /*public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getModo() {
        return modo;
    }

    public boolean isFin() {
        return fin;
    }

    public int getMinas() {
        return minas;
    }

    public int[][] getXogo() {
        return xogo;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public void setMinas(int minas) {
        this.minas = minas;
    }

    public void setXogo(int[][] xogo) {
        this.xogo = xogo;
    }*/
    
    
    
    //MÉTODOS
    
    
//Crea unha posición aleatoria e mete as minas    
    private void meterMinas(){
        int fil;
        int col;
        for (int c=0; c<minas; c++){
            fil =(int) Math.floor(Math.random() * (fila));
            col =(int) Math.floor(Math.random() * (columna));
            while (comprobar (fil,col)) {
                fil =(int) Math.floor(Math.random() * (fila));
                col =(int) Math.floor(Math.random() * (columna));
            }
            xogo [fil][col]=1;
        }
    }
    
    
//Recorre a matriz e amosa _ onde non se estivo e x nos lugares que xa se estivo    
    private void mostrarXogo(){
        for (int f=0; f<xogo.length; f++) {
            for (int c=0; c<xogo[f].length; c++) {
                if (xogo [f][c]==2){
                    System.out.print("O ");
                }
                else if (xogo [f][c]==8) {
                    System.out.print("B ");
                }
                else if (xogo [f][c]==1 && fin){
                    System.out.print("F ");
                }
                else System.out.print("_ ");
            }
            System.out.println();
        }
    }
    
    
//Comproba que os valores que lle pasamos estén dentro dos límites e senón volve a pedilos.
//Tamén comproba se hai un 0 en esa posición ou un 1. Se hai un cero pon ahí o valor 2 para que ao chamar a mostrarXogo() se poña unha x.    
    private int destapar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce a fila que queres buscar:");
        int f=entrada.nextInt ();
        System.out.println("Introduce a columna que queres buscar:");
        int c=entrada.nextInt();
            
        while (f<0 || f>fila-1 || c<0 || c>columna-1 || xogo [f][c]==2){
            if (f<0 || f>fila-1 || c<0 || c>columna-1){
               System.out.println("Non está dentro dos límites, volve a probar");
               System.out.println("Fila");
               f=entrada.nextInt();
               System.out.println("Columna");
               c=entrada.nextInt(); 
            }
            else {
                System.out.println("Xa visitaches este lugar, volve a probar:");
                System.out.println("Fila");
                f=entrada.nextInt();
                System.out.println("Columna");
                c=entrada.nextInt();
            }
                
        }
        if (modo==1){
            if (xogo [f][c]==0){
//O for comproba as minas de arredor e se esta en 0 coas de fora da matriz non fai nada  
                for (int fil=f-1; fil<=f+1; fil++){
                    for (int col=c-1; col<=c+1; col++){
                        if (fil<0 || fil>fila-1 || col<0 || col>columna-1);
                        else if (xogo[fil][col]==0) {
                            xogo [fil][col]=2;
                        }
                    }
                }
                xogo [f][c]=2;
                return 0;
            }
        }
        if (xogo [f][c]==0){
            xogo [f][c]=2;
            return 0;
        }
        else {
            xogo [f][c]=8;
            return 1;
        }
    }
    
    
//Inicia o xogo. Chama para que se metan as minas. Mostra o xogo e pide fila e columna e chama a destapar().
//Se destapar devolve 1, cambia o boolean fin a true e di que perdiches.    
    public void xogar(){
        dificultade();
        System.out.println("Imos a xogar ao buscaminas, aquí tes o teu campo:");
        meterMinas();
        mostrarXogo();
        modoXogo();
    }
    
    
//Comproba que na posición aleatoria xerada en meterMinas() non teñamos xa unha mina    
    private boolean comprobar(int fil, int col){
        boolean repetido=true;
        if (xogo [fil][col]==0) {
            repetido=false;
        }
        return repetido;
    }
    
    
//Comproba se queda algún 0 na matriz e se non quedan quere dicir que gañaches    
    private void ganar (){
        boolean ganar=true;
        if (modo==1) {
            for (int f=0; f<xogo.length && ganar; f++) {
                for (int c=0; c<xogo[f].length; c++){
                    if (xogo [f][c]==0) {
                        ganar=false;
                    }
                }
            }
            if (ganar) {
                fin=true;
                System.out.println("Gañaches, noraboa!");
            }
        }
        else if (modo==2) {
            for (int f=0; f<xogo.length && ganar; f++) {
                for (int c=0; c<xogo[f].length; c++){
                    if (xogo [f][c]==1) {
                        ganar=false;
                    }
                }
            }
            if (ganar) {
                fin=true;
                System.out.println("Gañaches, noraboa!");
            }
        }
        
    }
    
//Selecciona o nivel de dificultade. A máis dificultade, máis minas.
    private void dificultade(){
        Scanner modo = new Scanner(System.in);
        System.out.println("Selecciona a dificultade (1=Baixo (10 minas)   2=Medio (15 minas) 3=Alto (20 minas))");
        int dificultade = modo.nextInt();
        while (dificultade<1 || dificultade>3) {
            System.out.println("Dato non válido, introduce outro:");
            dificultade = modo.nextInt();
        }
        if (dificultade==1) {
            minas=10;
        }
        else if (dificultade==2) {
            minas=15;
        }
        else if (dificultade==3) {
            minas=20;
        }
    }
    
//Selecciona o modo de xogo. Un modo para atopar os ocos sen minas e outro para atopar as minas.
    private void modoXogo (){
        Scanner modoxogo = new Scanner(System.in);
        System.out.println("Selecciona o modo de xogo (1=Atopar os ocos sen minas   2=Atopar as minas)");
        modo=modoxogo.nextInt();
        while (modo<1 || modo>2) {
            System.out.println("Dato non válido, introduce outro:");
            modo=modoxogo.nextInt();
        }
        if (modo==1) {
            xogarClasico();
        }
        else if (modo==2) {
            xogarMinas();
        }
    }
    
    
//Modo de xogo clásico no que hai que atopar os ocos sen minas.    
    private void xogarClasico () {
        mostrarXogo();
        do {
            if (destapar()==1){
                fin=true;
                mostrarXogo();
                System.out.println("Perdiches, tocaches unha mina.");
            }
            else {
                mostrarXogo();
                ganar();
            }
        }
        while (!fin);
    }
    
    
//Modo de xogo no que hai que atopar as minas. Se erras 3 veces, perdes.    
    private void xogarMinas (){
        int errores=0;
        mostrarXogo();
        do {
            if (destapar()==0){
                errores++;
                mostrarXogo();
                if (errores==3) {
                    mostrarXogo();
                    System.out.println("Perdiches, tocaches 3 casillas vacías.");
                    fin=true;
                }
            }
            else {
                mostrarXogo();
                ganar();
            }
        }
        while (!fin);
    }
}
