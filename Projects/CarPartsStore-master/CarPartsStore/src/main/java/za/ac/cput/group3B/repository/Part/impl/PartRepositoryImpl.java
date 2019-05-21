package za.ac.cput.group3b.repository.Part.impl;

import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.repository.Part.PartRepository;

import java.util.*;

public class PartRepositoryImpl implements PartRepository {

    private static PartRepositoryImpl repository = null;
    private Set<Part> parts;

    private PartRepositoryImpl() { this.parts = new HashSet<>(); }

    private Part findPart(String partId) {
        return this.parts.stream()
                .filter(part -> part.getPartId().trim().equals(partId))
                .findAny()
                .orElse(null);
    }

    public static PartRepository getRepository() {
        if (repository == null) repository = new PartRepositoryImpl();
        return repository;
    }

    public Part create(Part part) {
        this.parts.add(part);
        return part;
    }

    public Part update(Part part) {
        Part toDelete = findPart(part.getPartId());
        if (toDelete != null) {
            this.parts.remove(toDelete);
            return create(part);
        }
        return null;
    }

    public void delete(String partId) {
        Part part = findPart(partId);
        if (part != null) this.parts.remove(part);
    }

    public Part read(String partId) {
        Part part = findPart(partId);
        return part;
    }

    public Set<Part> getAll() { return this.parts; }
}
