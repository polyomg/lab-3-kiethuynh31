package com.example.lab3.controller;

import com.example.lab3.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StaffController {

    @RequestMapping("/staff/detail")
    public String detail(Model model) {
        Staff staff = new Staff("kiethmts01297@fpt.edu.vn	","Huỳnh Minh Kiệt",2);
        model.addAttribute("staff", staff);
        return "/demo/staff-detail";
    }

    @RequestMapping("/staff/list")
    public String list(Model model) {
        List<Staff> list = List.of(
                new Staff("user1@gmail.com","nguyễn văn user1",0),
                new Staff("user2@gmail.com","nguyễn văn user2",1),
                new Staff("user3@gmail.com","nguyễn văn user3",2),
                new Staff("user4@gmail.com","nguyễn văn user4",2),
                new Staff("user5@gmail.com","nguyễn văn user5",1),
                new Staff("user6@gmail.com","nguyễn văn user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/staff-list";
    }

    @RequestMapping("/staff/list-status")
    public String listStatus(Model model) {
        List<Staff> list = List.of(
            new Staff("user1@gmail.com","nguyễn văn user1",0),
            new Staff("user2@gmail.com","nguyễn văn user2",1),
            new Staff("user3@gmail.com","nguyễn văn user3",2),
            new Staff("user4@gmail.com","nguyễn văn user4",2),
            new Staff("user5@gmail.com","nguyễn văn user5",1),
            new Staff("user6@gmail.com","nguyễn văn user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/list-status";
    }

    @RequestMapping("/staff/list-controls")
    public String listControls(Model model) {
        List<Staff> list = List.of(
            new Staff("user1@gmail.com","nguyễn văn user1",0),
            new Staff("user2@gmail.com","nguyễn văn user2",1),
            new Staff("user3@gmail.com","nguyễn văn user3",2),
            new Staff("user4@gmail.com","nguyễn văn user4",2),
            new Staff("user5@gmail.com","nguyễn văn user5",1),
            new Staff("user6@gmail.com","nguyễn văn user6",0)
        );
        model.addAttribute("list", list);
        return "/demo/list-controls";
    }

    // http://localhost:8080/staff/detail
    // http://localhost:8080/staff/list
    // http://localhost:8080/staff/list-status
    // http://localhost:8080/staff/list-controls
}
