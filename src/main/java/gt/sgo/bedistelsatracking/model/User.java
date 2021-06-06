package gt.sgo.bedistelsatracking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    String nombre;
    String correo;
    String passkey;
    int edad;
    @Id
    @GeneratedValue
    private long id;
}
