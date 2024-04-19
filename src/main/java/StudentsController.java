import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentsController {
    private TextField FirstName, LastName, Email, Course;
    private Button submit;
    protected void onsubmit(){
        String FirstName = this.FirstName.getText();
        String LastName = this.LastName.getText();
        String Email = this.Email.getAccessibleHelp();
        String Course = this.Course.getText();

        Students students = new Students(FirstName, LastName,Email,Course);
    }
}
