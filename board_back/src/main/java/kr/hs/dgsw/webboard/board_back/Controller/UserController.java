package kr.hs.dgsw.webboard.board_back.Controller;

import kr.hs.dgsw.webboard.board_back.Domain.User;
import kr.hs.dgsw.webboard.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/join")
    public Long join(@RequestBody User user){return this.userService.add(user);}

    @GetMapping(value="/users")
    public List users(){
        return this.userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public User user(@PathVariable Long id){return this.userService.findById(id);}

    @DeleteMapping(value = "/delete/{id}")
    public int delete(@PathVariable Long id){return this.userService.deleteById(id);}

    @PutMapping(value = "/modify")
    public int modify(@RequestBody User user){return this.userService.modify(user);}
}
