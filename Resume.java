import java.util.List;

public class Resume {

    private String fullName;
    private String email;
    private String phone;
    private String education;
    private List<Experience> experiences;

    public Resume(String fullName,
                  String email,
                  String phone,
                  String education,
                  List<Experience> experiences) {

        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.experiences = experiences;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEducation() {
        return education;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }
}
