package gt.sgo.bedistelsatracking.controller;

import gt.sgo.bedistelsatracking.model.LoginRequest;
import gt.sgo.bedistelsatracking.model.LoginResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<?> doLogin(@RequestBody LoginRequest loginRequest) {


        if (loginRequest.getUser().equals("darwyn") && loginRequest.getPasskey().equals("password")) {
            LoginResponse response = new LoginResponse(loginRequest.getUser());
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", JWTController.getJWTToken(loginRequest.getUser()));

            return new ResponseEntity<>(response, headers, HttpStatus.OK);
        } else
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
    }

}
