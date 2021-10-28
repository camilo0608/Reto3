/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.repository.crud;

import application.model.Quadbike;
import org.springframework.data.repository.CrudRepository;


/**
 * QuadbikeCrudRepository
 * Esta Interface se extiende de la interface CrudRepository quien contiene las
 * operaciones basicas CRUD sobre la base de datos, para poder actuar sobre la
 * tabla quadbike que tiene una llave primaria Integer
 * 
 * @since 2021-10-27
 * @version 1.0
 * @author Cristian Peña, Camilo Muñoz & Andres Bonilla
 */
public interface QuadbikeCrudRepository extends CrudRepository<Quadbike, Integer> {

}
