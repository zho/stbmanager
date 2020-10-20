package id.kings.stbmanager.controller;

import antlr.ASTNULLType;
import id.kings.stbmanager.model.Apps;
import id.kings.stbmanager.model.Category;
import id.kings.stbmanager.repository.AppsRepository;
import id.kings.stbmanager.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppsController {

    private final AppsRepository appsRepository;
    private final CategoryRepository categoryRepository;

    public AppsController(AppsRepository appsRepository, CategoryRepository categoryRepository) {
        this.appsRepository = appsRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/admin/apps")
    public String list(Model model) {

        List<Apps> list = appsRepository.findAll();
        model.addAttribute("list", list);

        return "apps/apps_list";
    }

    @GetMapping("/admin/apps/new")
    public String newApps(Model model) {

        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("catList", categoryList);

        return "apps/apps_new";
    }

    @PostMapping("/admin/apps/new")
    public String createApps(@RequestParam("category") Integer category,
                             @RequestParam("appName") String apkName,
                             @RequestParam("apkID") String apkId,
                             @RequestParam("apkURL") String apkUrl,
                             @RequestParam("apkVersion") String apkVersion,
                             @RequestParam(value = "install", defaultValue = "False") String install,
                             @RequestParam(value = "update", defaultValue = "False") String update) {

        Category categoryItem = categoryRepository.getOne(category);

        Apps apps = new Apps();
        apps.setApk(apkUrl);
        apps.setName(apkName);
        apps.setApkid(apkId);
        apps.setApk(apkUrl);
        apps.setVersion(apkVersion);
        apps.setFinstall(install);
        apps.setFupdate(update);
        apps.setCategory(categoryItem);

        appsRepository.save(apps);

        return "redirect:/admin/apps";
    }

    @GetMapping("/admin/apps/{id}")
    public String detail(Model model, @PathVariable Integer id){

        List<Category> categoryList = categoryRepository.findAll();
        model.addAttribute("catList", categoryList);

        Apps apps = appsRepository.getOne(id);
        model.addAttribute("detail", apps);

        return "apps/apps_detail";
    }

    @PostMapping("/admin/apps/{id}")
    public String update(@RequestParam("category") Integer category,
                         @RequestParam("appName") String apkName,
                         @RequestParam("apkID") String apkId,
                         @RequestParam("apkURL") String apkUrl,
                         @RequestParam("apkVersion") String apkVersion,
                         @RequestParam(value = "install", defaultValue = "False") String install,
                         @RequestParam(value = "update", defaultValue = "False") String update,
                         @PathVariable Integer id) {

        Category categoryItem = categoryRepository.getOne(category);

        Apps apps = appsRepository.getOne(id);
        apps.setApk(apkUrl);
        apps.setName(apkName);
        apps.setApkid(apkId);
        apps.setApk(apkUrl);
        apps.setVersion(apkVersion);
        apps.setFinstall(install);
        apps.setFupdate(update);
        apps.setCategory(categoryItem);

        appsRepository.save(apps);

        return "redirect:/admin/apps";
    }

    @GetMapping("/admin/apps/{id}/delete")
    public String delete(Model model, @PathVariable Integer id) {
        Apps apps = appsRepository.getOne(id);
        appsRepository.delete(apps);

        return "redirect:/admin/apps";
    }
}
