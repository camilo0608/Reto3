
package application.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
*categoria Esta Clase implementa Serializable
*es un Entity que se almacena con el nombre <H2> category </H2> en la Base de Datos 
*Contine los atributos y se maneja un autoincremento para idpersona 
*
*@since 201-10-25
*@version 1.0
*@author Edwin Camilo Muñoz 
*
*/

@Entity
@Table(name = "category")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="category")
    @JsonIgnoreProperties("category")
    private List<Quadbike> quadbikes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Quadbike> getQuadbikes() {
        return quadbikes;
    }

    public void setQuadbikes(List<Quadbike> quadbikes) {
        this.quadbikes = quadbikes;
    }

    
    
    
    
}
