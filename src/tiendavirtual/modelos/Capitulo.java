/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual.modelos;

import java.util.Date;

/**
 *
 * @author roland
 */
public class Capitulo extends Pelicula {
        
    private int id;
    private int numeroTemPer;

    public Capitulo(String titulo, String genero, String creador, int duracion, int ano,int numeroTemPer) {
        super(titulo, genero, creador, duracion, ano);
        this.numeroTemPer = numeroTemPer;
    }
    
    @Override
    public int getId() {
        return this.id; 
    }

    public int getNumeroTemPer() {
        return numeroTemPer;
    }

    public void setNumeroTemPer(int numeroTemPer) {
        this.numeroTemPer = numeroTemPer;
    }
    @Override
    public String toString() {
        
        return "\n :: CAPITULOS ::" + 
	"\n Title: " + getTitulo()+
	"\n Genero: " + getAno() + 
	"\n Creator: " + getCreador()+
	"\n Duration: " + getDuracion();
    }

    @Override
    public Date tiempoInicio(Date datoInicio) {
        return super.tiempoInicio(datoInicio); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tiempoDetenido(Date datoInicio, Date datoFin) {
        super.tiempoDetenido(datoInicio, datoFin); //To change body of generated methods, choose Tools | Templates.
    }
}