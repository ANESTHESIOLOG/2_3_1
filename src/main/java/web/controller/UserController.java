package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDao;
import web.model.User;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping()
    public String getAllUsers(Model model) {
        model.addAttribute("users", userDao.getAllUsers());
        return "getAllUsers";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
//        model.addAttribute("user", userDao.show(id));
//        return "show";
    return null;
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "/new";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") @Valid User user,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/new";
        }
        userDao.save(user);
        return "redirect:/user";
    }

    @GetMapping("/{id}/edite")
    public String editeUser(Model model, @PathVariable("id") int id) {
//        model.addAttribute("user", userDao.show(id));
//        return "editeUser";
        return null;
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
//        if (bindingResult.hasErrors()) {
//            return "editeUser";
//        }
//        userDao.update(id, user);
//        return "redirect:/user";
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
//        userDao.delete(id);
//        return "redirect:/user";
        return null;
    }
}
