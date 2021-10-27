/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.Model;

import application.Model.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
*Mensaje Esta Clase implementa Serializable
*es un Entity que se almacena con el nombre <H2> message </H2> en la Base de Datos 
*Contine los atributos y se maneja un autoincremento para idMenssage 
*
*@since 201-10-25
*@version 1.0
*@author Edwin Camilo Muñoz 
*
*/
@Entity
@Table(name = "message")
public class Mensaje implements Serializable {
    @Id
    /**
    *Definicion de la variable idMensaje
    *Contiene el codigo del mensaje
    *es un codigo autoincremental
    *
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    
    @ManyToOne
    /**
    *Trae informacion de la tabla Quadbike 
    *Contiene la informacion necesaria para almacenar el mensaje
    *de cada cuatrimoto 
    */
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"messages", "client", "reservations"})
    private Quadbike quadbike;

    @ManyToOne
    /**
    *Trae informacion de la tabla Client
    *Contiene la informacion necesaria para almacenar el mensaje
    *de cada cliente
    */
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"messages", "reservations", "client"})
    private Cliente client;

/**
*getIdMessage()
*Esta funcion retorna el id de mensaje
*@returm idMenssage
*/
    public Integer getIdMessage() {
        return idMessage;
    }
    
/**
*setIdMessage(Integer idMessage)
*Esta funcion recibe el id del mensaje y actualiza la informacion del objeto 
*@param idMessage, the idMessage to set 
*/
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

/**
*getMessageText()
*Esta funcion retorna el mensaje ingresado por el usuario 
*@returm the messageText
*/
     public String getMessageText() {
        return messageText;
    }
     
/**
*setMessageText(String messageText)
*Esta funcion recibe un mensaje y actualiza la informacion del objeto 
*@param messageText, the messageText to set 
*/
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    
/**
*getQuadbike()
*Esta funcion retorna la cuatrimoto almacenada en la base de datos 
*@returm the quadbike
*/
    public Quadbike getQuadbike() {
        return quadbike;
    }
    
/**
*setQuadbike(Quadbike quadbike)
*Esta funcion recibe la informacion almacenada de cuatrimotos
*@param quadbike, the quadbike to set 
*/
    public void setQuadbike(Quadbike quadbike) {
        this.quadbike = quadbike;
    }
    
/**
*getClient()
*Esta funcion retorna la informacion del cliente almacenada en la base de datos 
*@returm the client
*/
    public Cliente getClient() {
        return client;
    }

/**
*setClient(Cliente client)
*Esta funcion recibe un cliente y actualiza la informacion 
*del mensaje en la base de datos 
*@param client, the client to set 
*/
    public void setClient(Cliente client) {
        this.client = client;
    }
    
    
    
}
