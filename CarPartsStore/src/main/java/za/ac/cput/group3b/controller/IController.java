package za.ac.cput.group3b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IController {
    @GetMapping("/")
    @ResponseBody
    public String getHome() {
        return "Hello World";
    }
}
