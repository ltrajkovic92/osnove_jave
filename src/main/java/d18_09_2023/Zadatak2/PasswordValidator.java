package d18_09_2023.Zadatak2;

public class PasswordValidator extends Validator{
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult result = new ValidationResult();

        if (!this.password.contains("@") || !this.password.contains("#")
                || !this.password.contains("/") || this.password.contains("*")) {
            result.addError("Password must contain at least one special character.");
        }
        if (this.password.length()<8) {
            result.addError("Password must be minimum 8 characters.");
        }

        boolean hasUpperChar = false;
        for (int i = 0; i < this.password.length(); i++) {
            char c = this.password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperChar = true;
            }
        }
        if (!hasUpperChar) {
            result.addError("Password must contain at least one uppercase letter.");
        }
        boolean hasLowerChar = false;
        for (int i = 0; i < this.password.length(); i++) {
            char c = this.password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerChar = true;
            }
        }
        if (!hasLowerChar) {
            result.addError("Password must contain at least one lowercase letter.");
        }
        boolean hasDigit = false;
        for (int i = 0; i < this.password.length(); i++) {
            char c = this.password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }
        if (!hasDigit) {
            result.addError("Password must contain at least one digit.");
        }
        return result;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
