package za.ac.cput.group3b.controller.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.factory.Part.PartFactory;
import za.ac.cput.group3b.service.Part.PartService;

import java.util.Set;

@RestController
@RequestMapping("/part")
public class PartController {
    @Autowired
    private PartService service;

    @GetMapping("/create/{partName}")
    public @ResponseBody
    Part create(@PathVariable String partName, double price) {
        Part part = PartFactory.getPart(partName, price);
        return service.create(part);
    }

    @GetMapping("/update/{partName}")
    public @ResponseBody
    Part update(@PathVariable String partName, double price) {
        Part part = PartFactory.getPart(partName, price);
        return service.update(part);
    }

    @GetMapping("/delete/{id}")
    public @ResponseBody
    void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    public @ResponseBody
    Part read(@PathVariable String id) {return service.read(id); }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Part> getAll() { return service.getAll(); }
}
