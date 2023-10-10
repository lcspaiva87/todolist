package br.com.lucaspaiva.todolist.user;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        var user = this.userRepository.findByUsername(userModel.getUsername());

           if(user != null){
            System.out.println("Usuário já existe");
            return ResponseEntity.status(400).body("Usuário já existe");
        }
        var useCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(201).body(useCreated);  
    }
}