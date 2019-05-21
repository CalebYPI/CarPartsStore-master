package za.ac.cput.group3b.factory.Part;

import za.ac.cput.group3b.domain.Part.Part;

public class PartFactory {
    public static Part getPart(String partId, String partName, double partPrice) {
        return new Part.Builder()
                .partId(partId)
                .partName(partName)
                .partPrice(partPrice)
                .build();
    }
}
