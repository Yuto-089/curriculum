package check;


import constants.Constants;

public class Main {
 
    private String firstName = "中島";
    private String lastName = "裕人";

    public static void main(String[] args) {
     
        Main main = new Main();

      
        main.printName(main.firstName, main.lastName);

      
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

   
        pet.introduce();

      
        robotPet.introduce();
    }

   
    private void printName(String firstName, String lastName) {
        System.out.println("名前: " + firstName + " " + lastName);
    }
}
