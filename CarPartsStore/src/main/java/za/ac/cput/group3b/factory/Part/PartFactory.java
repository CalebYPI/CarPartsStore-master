package za.ac.cput.group3b.factory.Part;

import za.ac.cput.group3b.domain.Part.Part;
import za.ac.cput.group3b.util.Misc;

public class PartFactory {
    public static Part getPart(String partName, double partPrice) {
        return new Part.Builder()
                .partId(Misc.generateId())
                .partName(partName)
                .partPrice(partPrice)
                .build();
    }
}
