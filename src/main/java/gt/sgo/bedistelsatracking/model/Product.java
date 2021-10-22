package gt.sgo.bedistelsatracking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonSerialize
@Entity
public class Product {
    @Id
    @GeneratedValue
    @JsonProperty("id")
    private Long idProducto;

    @JsonProperty("name")
    String nombre;
    @JsonProperty("description")
    String descripcion;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Long getIdProducto() {
        return idProducto;
    }
}
