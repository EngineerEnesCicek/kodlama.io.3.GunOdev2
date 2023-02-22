package Users;

public class Instructor extends User{
    private String Branch;

    public Instructor(String branch) {
        Branch = branch;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}
