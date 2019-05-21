package za.ac.cput.group3b.domain.Part;

import java.util.Objects;

public class Part {

    private String partId, partName;
    private double partPrice;

    private Part() {}

    private Part(Builder builder) {
        this.partId = builder.partId;
        this.partName = builder.partName;
        this.partPrice = builder.partPrice;
    }

    public String getPartId() {
        return partId;
    }

    public String getPartName() {
        return partName;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public static class Builder {
        private String partId, partName;
        private double partPrice;

        public Builder partId(String partId) {
            this.partId = partId;
            return this;
        }

        public Builder partName(String partName) {
            this.partName = partName;
            return this;
        }

        public Builder partPrice(double partPrice) {
            this.partPrice = partPrice;
            return this;
        }

        public Part build() {
            return new Part(this);
        }
    }

    @Override
    public String toString() {
        return "Part{" +
                "Part Id: " + getPartId() +
                ", Part Name: '" + getPartName() + '\'' +
                ", Part Price: R" + getPartPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return part.equals(part.partId);
    }

    @Override
    public int hashCode() { return Objects.hash(partId); }
}
