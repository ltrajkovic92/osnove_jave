package p14_09_2023.Zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {

        TestCase firstCase = new TestCase(101,"Primer 1");

        TestStep Step1 = new TestStep("Open app", "", "","");
        TestStep Step2 = new TestStep("Check if login link is visible", "visible", "visible","");
        TestStep Step3 = new TestStep("Click on login link", "", "","");
        TestStep Step4 = new TestStep("Click on login link", "", "","");
        TestStep Step5 = new TestStep("Check if form is visible", "visible","visible","");
        TestStep Step6 = new TestStep("Enter username", "", "","");
        TestStep Step7 = new TestStep("Enter password", "", "","");
        TestStep Step8 = new TestStep("Check if login button is visible", "visible", "invisible", "Login button is not visible");
        TestStep Step9 = new TestStep("Click on login button", "","","");
        TestStep Step10 = new TestStep("User should be logged", "logged","not logged", "User is not logged");
        TestStep Step11 = new TestStep("Page should be /home","/login","/home","User should be redirected to home page");

        firstCase.addTestSteps(Step1);
        firstCase.addTestSteps(Step2);
        firstCase.addTestSteps(Step3);
        firstCase.addTestSteps(Step4);
        firstCase.addTestSteps(Step5);
        firstCase.addTestSteps(Step6);
        firstCase.addTestSteps(Step7);
        firstCase.addTestSteps(Step8);
        firstCase.addTestSteps(Step9);
        firstCase.addTestSteps(Step10);
        firstCase.addTestSteps(Step11);

        firstCase.print();
    }
}
