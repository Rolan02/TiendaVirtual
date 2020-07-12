/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roland
 */
public class Serie extends Animacion {
    
    private int id;
    private int cantidadTem;
    private ArrayList<Capitulo> capitulos;
    
    public Serie(String titulo, String genero, String creador,int duracion, int cantidadTem, int ano) {
        super(titulo, genero, creador, duracion,ano);
        this.cantidadTem = cantidadTem;
    }

    public int getId() {
        return id;
    }

    public int getCantidadTem() {
        return cantidadTem;
    }
    public ArrayList<Capitulo> getcapitulos(){
        return capitulos;
    }
    
    @Override
    public String toString() {
        
        return "\n :: SERIE ::" + 
	"\n Title: " + getTitulo()+
	"\n Genero: " + getGenero() + 
	"\n Year: " + getAno()+ 
	"\n Creator: " + getCreador()+
	"\n Duration: " + getDuracion();
    }

}
