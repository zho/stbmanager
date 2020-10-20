package id.kings.stbmanager.controller;

import id.kings.stbmanager.model.Logins;
import id.kings.stbmanager.repository.LoginsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginsController {

    private final LoginsRepository loginsRepository;

    public LoginsController(LoginsRepository loginsRepository) {
        this.loginsRepository = loginsRepository;
    }

    @GetMapping("/admin/logins")
    public String list(Model model) {

        List<Logins> list = loginsRepository.findAll();
        model.addAttribute("list", list);

        return "logins_list";
    }

    @GetMapping("/admin/logins/new")
    public String newLogins(Model model) {
        return "logins_new";
    }

    @PostMapping("/admin/logins/new")
    public String createLogins(Model model) {
        return "redirect:/admin/logins";
    }

    @GetMapping("/admin/logins/{id}")
    public String detail(Model model, @PathVariable String id){
        return "logins_detail";
    }

    @PostMapping("/admin/logins/{id}")
    public String update(Model model, @PathVariable String id) {
        return "redirect:/admin/logins";
    }

    @GetMapping("/admin/logins/{id}/delete")
    public String delete(Model model, @PathVariable Long id) {
        Logins logins = loginsRepository.getOne(id);
        loginsRepository.delete(logins);

        return "redirect:/admin/logins";
    }
}
