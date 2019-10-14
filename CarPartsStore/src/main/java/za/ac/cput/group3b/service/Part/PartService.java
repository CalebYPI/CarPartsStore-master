package za.ac.cput.group3b.service.Part;

import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface PartService extends IService<Part, String> {
    Set<Part> getAll();
}
