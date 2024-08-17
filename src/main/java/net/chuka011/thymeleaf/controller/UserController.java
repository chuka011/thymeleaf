package net.chuka011.thymeleaf.controller;

import net.chuka011.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
