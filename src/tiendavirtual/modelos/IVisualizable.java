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
public interface IVisualizable { 
        
   Date tiempoInicio(Date datoInicio);
   void tiempoDetenido(Date datoInicio, Date datoFin);
    
}

