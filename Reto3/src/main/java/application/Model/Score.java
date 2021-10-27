/*
 * Crear base de datos MySQL y conectarlas, H2 me crea una base de datos
 * volatil mediante Spring JPA ideal para el desarrollo
 */
package application.Model;
import application.Model.Reservaciones;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Esta clase es un entity que se almacena con el nombre score
 * @author cterr
 */

@Entity
@Table(name="score")
public class Score implements Serializable{
    
    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = IDENTITY) 
    private Integer id;
    
    @Column(name = "score",precision = 1, scale = 0)
    private Integer score;
    
    @Column(name = "message", length = 250)
    private String message;
    
    
    @OneToOne
    @JoinColumn(name="reservation")
    @JsonIgnoreProperties({"score"})
    private Reservaciones reservation;
    

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
          
    /**
     * @return the idScore
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the idScore to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the Score
     */
    public Integer getScore() {
        return score;
    }

    /**
     * @param score the Score to set
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * @return the reservation
     */
    public Reservaciones getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservaciones reservation) {
        this.reservation = reservation;
    }
}

