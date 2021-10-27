/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.repository.crud;

import application.Model.Reservaciones;
import org.springframework.data.repository.CrudRepository;

/**
*InterfaceReservaciones
*Esta interface implementa el Repository que es manejado por JPA
*de la Tabla y Clase Reservaciones
*
*@since 2021-10-25
*@version 1.0
*@author Edwin Camilo Muñoz 
*
*/
public interface InterfaceReservaciones extends CrudRepository<Reservaciones,Integer>{
    
}
