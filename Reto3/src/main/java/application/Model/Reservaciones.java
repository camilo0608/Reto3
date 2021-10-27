/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.Model;

import application.Model.Quadbike;
import application.Model.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
*Reservaciones Esta Clase implementa Serializable
*es un Entity que se almacena con el nombre <H2> reservation </H2> en la Base de Datos 
*Contine los atributos y se maneja un autoincremento para idReservation 
*
*@since 201-10-25
*@version 1.0
*@author Edwin Camilo Muñoz 
*
*/
@Entity
@Table(name = "reservation")
public class Reservaciones implements Serializable  {
    
     @Id
    /**
    *Definicion de la variable idReservation
    *Contiene el codigo de la reservacion 
    *es un codigo autoincremental
    *
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status="created";
    
    @ManyToOne
    /**
    *Trae informacion de la tabla Quadbike 
    *Contiene la informacion necesaria para almacenar la reservacion de una id
    *especifica de una cuatrimoto 
    */
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Quadbike quadbike;

    @ManyToOne
     /**
    *Trae informacion de la tabla Client
    *Contiene la informacion necesaria para almacenar la reservacion echa
    *por un cliente identificando su informacion por medio del id 
    */
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Cliente client;

    private String score; 

/**
*getIdReservation()
*Esta funcion retorna el id de la reservacion
*@returm idReservation
*/    
    public Integer getIdReservation() {
        return idReservation;
    }

/**
*setIdReservation(Integer idReservation)
*Esta funcion recibe el id de la reservacion y actualiza la informacion del objeto 
*@param idReservation, the idReservation to set 
*/    
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

/**
*getStartDate()
*Esta funcion retorna la fecha de inicio de la reservacion
*@returm startDate
*/  
    public Date getStartDate() {
        return startDate;
    }
/**
*setStartDate(Date startDate)
*Esta funcion recibe la fecha de inicio de la reservacion y actualiza la informacion del objeto 
*@param startDate, the startDate to set 
*/      
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

/**
*getDevolutionDate()
*Esta funcion retorna la fecha de entrega para la reservacion
*@returm devolutionDate
*/  
    public Date getDevolutionDate() {
        return devolutionDate;
    }
/**
*setDevolutionDate(Date devolutionDate)
*Esta funcion recibe la fecha de entrega para la reservacion y actualiza 
*la informacion del objeto 
*@param devolutionDate, the devolutionDate to set 
*/   
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

/**
*getStatus()
*Esta funcion retorna el estado en el que se encuentra la reservacion
*@returm status
*/  
    public String getStatus() {
        return status;
    }
/**
*setStatus(String status)
*Esta funcion recibe el estado de la reservacion y actualiza la informacion del objeto 
*@param status, the status to set 
*/    
    public void setStatus(String status) {
        this.status = status;
    }

/**
*getQuadbike()
*Esta funcion retorna el id de la cuatrimoto a reservar 
*@returm quadbike
*/  
    public Quadbike getQuadbike() {
        return quadbike;
    }
/**
*setQuadbike(Quadbike quadbike)
*Esta funcion recibe el id de la cuatrimoto que se va reservar y 
*actualiza la informacion del objeto 
*@param quadbike, the quadbike  to set 
*/    
    public void setQuadbike(Quadbike quadbike) {
        this.quadbike = quadbike;
    }

/**
*getClient()
*Esta funcion retorna el id del cliente que esta haciendo la reservacion
*@returm client
*/  
    public Cliente getClient() {
        return client;
    }
/**
*setClient(Cliente client) 
*Esta funcion recibe el id del cliente que esta haciendo la reservacion
*y actualiza la informacion del objeto 
*@param client, the client to set 
*/    
    public void setClient(Cliente client) {
        this.client = client;
    }

/**
*getScore()
*Esta funcion retorna el puntaje del cliente respecto a la reservacion
*@returm score
*/  
    public String getScore() {
        return score;
    }
/**
*setScore(String score) 
*Esta funcion recibe el puntaje del cliente respecto a la reservacion
*y actualiza la informacion del objeto 
*@param score, the score to set 
*/    
    public void setScore(String score) {
        this.score = score;
    }
    
    
    
}
