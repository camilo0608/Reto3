 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.repository.crud;

import application.model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
*ReservationCrudRepository
*Esta interface implementa el Repository que es manejado por JPA
*de la Tabla y Clase Reservation
*
*@since 2021-10-25
*@version 1.0
*@author Cristian Peña, Camilo Muñoz & Andres Bonilla 
*
*/
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    
}
