package p14_09_2023.Zadatak5;

public class TestStep {
    private String description;
    private String actualResults;
    private String expectedResults;
    private String errorMessage;

    public TestStep(String description, String actualResults, String expectedResults, String errorMessage) {
        this.description = description;
        this.actualResults = actualResults;
        this.expectedResults = expectedResults;
        this.errorMessage = errorMessage;
    }
    public boolean validate () {
        if (this.expectedResults.equals(this.actualResults)) {
            return true;
        }
        return false;
    }

    public void print () {
        System.out.println("| Opis: "+this.description+" ");
        System.out.print("| Status: "+(this.validate()?"passed":"failed | "));
        if(!this.validate()) {
            System.out.println("Error message: " + this.errorMessage);
        }
    }

    public String getDescription() {
        return description;
    }

    public String getActualResults() {
        return actualResults;
    }

    public String getExpectedResults() {
        return expectedResults;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
