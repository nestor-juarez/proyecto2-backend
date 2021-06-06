package gt.sgo.bedistelsatracking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonSerialize
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @JsonProperty("name")
    String name;
    @JsonProperty("email")
    String email;
    @JsonProperty("password")
    String password;
    @JsonProperty("age")
    int age;
}
