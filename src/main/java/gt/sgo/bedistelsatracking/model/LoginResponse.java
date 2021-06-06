package gt.sgo.bedistelsatracking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@JsonSerialize
@Entity
public class LoginResponse {

    @JsonProperty("username")
    String username;
    @Id
    @GeneratedValue
    private long id;

    public LoginResponse(String username) {
        this.username = username;
    }

    public LoginResponse() {

    }
}
