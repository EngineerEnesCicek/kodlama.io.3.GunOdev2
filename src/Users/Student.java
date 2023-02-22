package Users;

public class Student extends User{
    private String university;

    public Student(String university) {
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
