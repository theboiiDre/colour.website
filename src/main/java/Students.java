public class Students {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Course;

    public Students(String firstName, String lastName, String email, String course) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Course = course;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getCourse() {
        return Course;
    }
}

