package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        String assetid = request.getParameter("assetid");
        if (assetid == null) {
            List<Assets> selall = indexService.selall();
            model.addAttribute("list", selall);
        } else {
            List<Assets> assets = indexService.selBy(assetid);
            model.addAttribute("list", assets);
        }
        return "index";
    }

    @RequestMapping("/add")
    public String add(Assets assets, HttpSession session) {
        assets.setId(5);
        int add = indexService.add(assets);
        return "redirect:/";
    }
}
