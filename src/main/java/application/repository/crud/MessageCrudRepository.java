
package application.repository.crud;

import application.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
*MessageCrudRepository
*Esta interface implementa el Repository que es manejado por JPA
*de la Tabla y Clase Message
*
*@since 2021-10-25
*@version 1.0
*@author Cristian Peña, Camilo Muñoz & Andres Bonilla 
*
*/
public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
    
}
