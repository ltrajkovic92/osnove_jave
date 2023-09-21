package d18_09_2023.Zadatak2;

import java.util.ArrayList;

public class ValidationResult {
    private boolean hasErrors;
    private ArrayList<String> errors;

    public ValidationResult() {
        this.errors = new ArrayList<>();
    }
    public void addError (String error) {
        this.hasErrors = true;
        this.errors.add(error);
    }
    public void print () {
        if (hasErrors) {
            for (int i = 0; i < this.errors.size(); i++) {
                System.out.println(errors.get(i));
            }
        }
        else {
            System.out.println("No validation errors.");
        }
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public ArrayList<String> getErrors() {
        return errors;
    }
}
