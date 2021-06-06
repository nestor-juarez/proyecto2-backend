package gt.sgo.bedistelsatracking.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class LoginResponse {
    @JsonProperty("name")
    String name;
    @JsonProperty("email")
    String email;
    @JsonProperty("age")
    int age;

    public LoginResponse(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public static LoginResponse userToLoginResponse(User user) {
        return new LoginResponse(user.name, user.email, user.age);
    }
}
