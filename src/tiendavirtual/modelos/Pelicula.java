/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rolands
 */
public class Pelicula extends Animacion implements IVisualizable {
    
    private int id;
    private int tiempoVisto;

    public Pelicula(String titulo, String genero, String creador, int duracion, int ano) {
        super(titulo, genero, creador, duracion, ano);
    }
    
    

    public void mostrarDatos(){
//        System.out.println("Titulo" + titulo);
//        System.out.println("Genero" + genero);   
    }

    public int getId() {
        return id;
    }

    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }
   
    @Override
    public String toString() {
        
        return "\n :: PELICULA ::" + 
	"\n Titulo: " + getTitulo()+
	"\n Genero: " + getGenero() + 
	"\n Year: " + getAno()+ 
	"\n Creator: " + getCreador()+
	"\n Duration: " + getDuracion();
    }

    @Override
    public Date tiempoInicio(Date datoInicio) {
      return datoInicio;
    }

    @Override
    public void tiempoDetenido(Date datoInicio, Date datoFin) {
        
        if (datoFin.getSeconds() > datoInicio.getSeconds()) {    
            setTiempoVisto(datoFin.getSeconds() - datoInicio.getSeconds());

        } else {
            setTiempoVisto(0);
        }
    }
    public static ArrayList<Pelicula> generarListaPeliculas(){
        
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        for (int i = 1; i < 5; i++) {
            
        peliculas.add(new Pelicula("TIBURON"+ i, "TERROR", "BRYAN", 120 , 2020 + i));
        
        }
        return peliculas;
    }
    //public static void formatoDeMostrado(){}

}
