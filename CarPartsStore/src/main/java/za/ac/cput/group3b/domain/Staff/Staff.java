package za.ac.cput.group3b.domain.Staff;

import java.util.Objects;

public class Staff {
    private String staffId, staffFName, staffLName, staffJobTitle;

    private Staff() {}

    private Staff(Builder builder) {
        this.staffId = builder.staffId;
        this.staffFName = builder.staffFName;
        this.staffLName = builder.staffLName;
        this.staffJobTitle = builder.staffJobTitle;
    }

    public String getStaffId() { return staffId; }

    public String getStaffFName() { return staffFName; }

    public String getStaffLName() { return staffLName; }

    public String getStaffJobTitle() { return staffJobTitle; }

    public static class Builder {
        private String staffId, staffFName, staffLName, staffJobTitle;

        public Builder staffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder staffFName(String staffFName) {
            this.staffFName = staffFName;
            return this;
        }

        public Builder staffLName(String staffLName) {
            this.staffLName = staffLName;
            return this;
        }

        public Builder staffJobTitle(String staffJobTitle) {
            this.staffJobTitle = staffJobTitle;
            return this;
        }

        public Staff build() {
            return new Staff(this);
        }

    }

    @Override
    public String toString() {
        return "Staff{ " +
                "\nStaff ID: " + getStaffId() +
                "\nStaff First Name: " + getStaffFName() +
                "\nStaff Last Name: " + getStaffLName() +
                "\nStaff Job Title: " + getStaffJobTitle() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffId.equals(staff.staffId);
    }

    @Override
    public int hashCode() { return Objects.hash(staffId); }
}
