package za.ac.cput.group3b.service.Part.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.Part.PartRepository;
import za.ac.cput.group3b.repository.Part.impl.PartRepositoryImpl;
import za.ac.cput.group3b.service.Part.PartService;

import java.util.Set;

@Service
public class PartServiceImpl implements PartService {

    private static PartServiceImpl service = null;
    private PartRepository repository;

    private PartServiceImpl() { this.repository = PartRepositoryImpl.getRepository(); }

    public static PartServiceImpl getService() {
        if (service == null) service = new PartServiceImpl();
        return service;
    }

    public Part create(Part part) { return this.repository.create(part); }

    public Part update(Part part) { return this.repository.update(part); }

    public void delete(String s) { this.repository.delete(s); }

    public Part read(String s) {return this.read(s); }

    public Set<Part> getAll() { return this.repository.getAll(); }
}
