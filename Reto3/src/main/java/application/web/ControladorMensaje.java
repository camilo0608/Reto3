
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.web;

import application.service.ServiciosMensaje;
import application.Model.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RequestMapping("/api/Message")
 * Anotación que se encarga de relacionar un método con una petición http
 * @author edwin Camilo 
 */

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
/**
*ControladorMensaje
*Esta Clase implementa los metodos para la clase mensaje
*generando el GET, POST, PUT y DELETE para la tabla  
*
*@author Edwin Camilo Muñoz 
*
*/
public class ControladorMensaje {
     @Autowired
    private ServiciosMensaje servico;
    @GetMapping("/all")
    public List<Mensaje> getMessages(){
        return servico.getAll();
    }
/**
*Definicion del metodo GET para el id del mensaje 
*Contiene el codigo del metodo GET para consultar la informacion
* almacenada en el id de un determinado mensaje 
*
*/
    @GetMapping("/{id}")
    public Optional<Mensaje> getMessage(@PathVariable("id") int messageId) {
        return servico.getMessage(messageId);
    }
    
/**
*Definicion del metodo POST para la tabla Mensaje
*Contiene el codigo del metodo POST para guardar nueva informacion
*en un id especifico de un mensaje 
*
*/
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje message) {
        return servico.save(message);
    }
    
/**
*Definicion del metodo PUT para la tabla Mensaje
*Contiene el codigo del metodo PUT para actualizar la informacion
*en un id especifico de un mensaje 
*
*/ 
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje update(@RequestBody Mensaje message) {
        return servico.update(message);
    }
    
/**
*Definicion del metodo DELETE para la tabla Mensaje
*Contiene el codigo del metodo DELETE para borrar la informacion
*en un id especifico de un mensaje 
*
*/ 
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int messageId) {
        return servico.deleteMessage(messageId);
    }
    
}
