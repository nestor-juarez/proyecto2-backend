package gt.sgo.bedistelsatracking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonSerialize
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    long id_usuario;

    @JsonProperty("name")
    String nombre;
    @JsonProperty("lastname")
    String apellido;
    @JsonProperty("email")
    String email;
    @JsonProperty("password")
    String contrasenia;
    @JsonProperty("employe_id")
    int codigo_empleado;

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }
}
