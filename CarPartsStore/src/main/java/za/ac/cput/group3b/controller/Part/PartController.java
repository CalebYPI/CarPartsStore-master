package za.ac.cput.group3b.controller.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.service.Part.PartService;

import java.util.Set;

@RestController
@RequestMapping("/part")
public class PartController {
    @Autowired
    @Qualifier("ServiceImpl")
    private PartService service;

    @PostMapping("/create")
    @ResponseBody
    public Part create(Part part) { return service.create(part); }

    @PostMapping("/update")
    @ResponseBody
    public Part update(Part part) { return service.update(part); }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Part read(@PathVariable String id) {return service.read(id); }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Part> getAll() { return service.getAll(); }
}
