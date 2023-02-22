import Loggers.DatabaseLogger;
import Loggers.EmailLogger;
import Loggers.Logger;
import Users.Instructor;
import Users.Student;
import Users.User;
import UsersManager.InstructorManager;
import UsersManager.StudentManager;
import UsersManager.UserManager;

public class Main {
    public static void main(String[] args) {
        User user1=new Student("Osmangazi Üniversitesi");
        user1.setId(1);
        user1.setFirstName("Enes");
        user1.setLastName("Çiçek");
        User user2=new Instructor("Java");
        user2.setId(2);
        user2.setFirstName("Engin");
        user2.setLastName("Demiroğ");
        UserManager userManager1=new StudentManager();
        userManager1.add();
        Logger logger1=new DatabaseLogger();
        logger1.log();
        UserManager userManager2=new InstructorManager();
        userManager2.add();
        Logger logger2=new EmailLogger();
        logger2.log();

    }
}