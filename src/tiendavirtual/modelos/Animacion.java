/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendavirtual.modelos;

/**
 *
 * @author roland
 */
public class Animacion {
    
    private int id;
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private int ano;
    private boolean estado;

    public Animacion(String titulo, String genero,String creador, int duracion, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.creador = creador;
        this.ano = ano;    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String isEstado() {
        String visto  = "";
        if (estado == true) {
            visto = "Ya lo viste";
            
        }else{
            visto = "No";
        }
        return visto;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

   
    
    
    
}
