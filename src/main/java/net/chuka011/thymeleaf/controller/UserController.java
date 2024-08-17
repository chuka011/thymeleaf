package net.chuka011.thymeleaf.controller;

import net.chuka011.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Bane", "bane@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Bane", "bane@gmail.com", "ADMIN", "male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", "1");
        return "link-expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("users")
    public String users(Model model) {
        User user = new User("Bane", "bane@gmail.com", "ADMIN", "male");
        User user1 = new User("Marko", "marko@gmail.com", "DEV", "male");
        User user2 = new User("John", "john@gmail.com", "DEV", "male");
        model.addAttribute("users", List.of(user, user1, user2));
        return "users";
    }
}
