package id.kings.stbmanager.controller;

import id.kings.stbmanager.model.Category;
import id.kings.stbmanager.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/admin/category")
    public String list(Model model) {

        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("list", categoryList);

        return "category/list";
    }

    @GetMapping("/admin/category/new")
    public String add(){

        return "category/new";
    }

    @PostMapping("/admin/category/new")
    public String create(@RequestParam("name") String name) {

        Category category = new Category();
        category.setName(name);
        categoryRepository.save(category);

        return "redirect:/admin/category";
    }

    @GetMapping("/admin/category/{id}")
    public String detail(@PathVariable Integer id, Model model) {

        Category category = categoryRepository.getOne(id);
        model.addAttribute("detail", category);

        return "category/detail";
    }

    @PostMapping("/admin/category/{id}")
    public String update(@PathVariable Integer id,
                         @RequestParam("name") String name) {

        Category category = categoryRepository.getOne(id);
        category.setName(name);

        categoryRepository.save(category);

        return "redirect:/admin/category";
    }

    @GetMapping("/admin/category/{id}/delete")
    public String delete(@PathVariable Integer id) {

        Category category = categoryRepository.getOne(id);
        categoryRepository.delete(category);

        return "redirect:/admin/category";
    }

}
