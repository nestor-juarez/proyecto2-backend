package gt.sgo.bedistelsatracking.controller;

import gt.sgo.bedistelsatracking.model.LoginRequest;
import gt.sgo.bedistelsatracking.model.LoginResponse;
import gt.sgo.bedistelsatracking.model.User;
import gt.sgo.bedistelsatracking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> doLogin(@RequestBody LoginRequest loginRequest) {

        User locatedUser = userRepository.findUserByEmailAndPassword(loginRequest.getUser(), loginRequest.getPasskey());

        if (locatedUser != null) {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Authorization", JWTController.getJWTToken(loginRequest.getUser()));

            return new ResponseEntity<>(LoginResponse.userToLoginResponse(locatedUser), headers, HttpStatus.OK);
        } else
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
