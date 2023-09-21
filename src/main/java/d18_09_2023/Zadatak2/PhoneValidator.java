package d18_09_2023.Zadatak2;

public class PhoneValidator extends Validator{
    private String phoneNumber;

    public PhoneValidator(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public ValidationResult validate() {
        ValidationResult result = new ValidationResult();
        if (!this.phoneNumber.startsWith("+")) {
            result.addError("Phone number must start with +");
        }
        if (this.phoneNumber.contains(" ")) {
            result.addError("Phone number cannot contain spaces.");
        }
        boolean hasOnlyNumbers = false;
        for (int i = 0; i < this.phoneNumber.length(); i++) {
            char c = this.phoneNumber.charAt(i);
            if (!Character.isDigit(c)) {
                hasOnlyNumbers = true;
            }
        }
        if (hasOnlyNumbers) {
            result.addError("Phone number can only contain numbers.");
        }
        return result;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
