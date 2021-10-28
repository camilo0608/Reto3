/*
 * Crear base de datos MySQL y conectarlas, H2 me crea una base de datos
 * volatil mediante Spring JPA ideal para el desarrollo
 */
package application.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * Quadbike
 Esta clase es un entity que se almacena con el nombre quadbike en la base de Datos
 Contiene los atributos y se maneja un autoincremento para id
 * 
 * @since 26-10-2021
 * @version 1.0
 * @author Grupo 0.
 */
@Entity
@Table(name="score")
public class Score implements Serializable{
    
    /**
     * Constructor de la clase Score.
     */
    public Score() {
    }
    
    /**
     * Atributo integer que actua como llave principal de la clase Score.
     */
    @Id
    @Column(name = "idScore")
    @GeneratedValue( strategy = GenerationType.IDENTITY) 
    private Integer idScore; 
    
    /**
     * Atributo Integer que almacena el puntaje de la reservación asociada.
     * Precision de 1 digito con escala de 0 decimales.
     */ 
    @Column(name = "score",precision = 1, scale = 0)
    private Integer score;
    
    /**
     * Atributo String que almacena el mensaje del puntaje.
     * Longitud de 250 caracteres.
     */
    @Column(name = "message", length = 250)
    private String message;
    
    /**
     * Atributo Reservation que relaciona el entity Score con un entity reservation.
     * La relación se da mediante la llave foranea reservation.
     * La relacioón es de uno a uno.
     */
    @OneToOne
    @JoinColumn(name="reservation")
    @JsonIgnoreProperties({"score"})
    private Reservation reservation;
    

    /**
     * Función que devuelve el String almacenada en el atributo
     * message.
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Función que recibe el String message y lo almacena en el atributo
     * message.
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
          
    /**
     * Función que devuelve el Integer almacenada en el atributo score. 
     * @return the Score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Función que recibe el Integer score y lo almacena en el atributo score.
     * @param score the Score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * Función que devuelve el Reservation almacenada en el atributo
     * reservation.
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Función que recibe el Reservation reservation y lo almacena en el atributo
     * reservation.
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    /**
     * Función que devuelve el Integer almacenada en el atributo
     * idScore.
     * @return the idScore
     */
    public Integer getIdScore() {
        return idScore;
    }

    /**
     * Función que recibe el Integer y lo almacena en el atributo idScore.
     * @param idScore the idScore to set
     */
    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }
}


