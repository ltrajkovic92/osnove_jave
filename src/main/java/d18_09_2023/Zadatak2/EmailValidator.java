package d18_09_2023.Zadatak2;

public class EmailValidator extends Validator{
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult result = new ValidationResult();
        if (!this.email.contains("@")) {
            result.addError("Email is invalid. Email must contain @.");
        }
        if (!this.email.endsWith(".com") || this.email.endsWith(".net")) {
            result.addError("Email is invalid. Email must end with .com or .net.");
        }
        return result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
