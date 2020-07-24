package check;

import constants.Constants;

public class Check {

	private static String firstName = "Yamamoto";
	private static String lastName = "Noriaki";

	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}

	public static void main(String[] args) {
		Check check1 = new Check();
		check1.printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		pet.introduce();
		robotPet.introduce();

		}



}
