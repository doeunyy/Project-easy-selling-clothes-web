package board.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/signupForm")
    public String signupForm() {

        return "usersignupform";
    }

    @GetMapping("user/loginForm")
    public String loginForm() {

        return "userloginform";
    }

}
