package Classes;
import java.util.Scanner;

public class InputHandler {

    private static final String INVALID = "Input not valid. Please try again.";

    public void inputInvalid() {
        System.out.println(INVALID);
    }

    public String inputName() {

        String name = "";
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the full name: ");
                Scanner input = new Scanner(System.in);
                name = input.nextLine();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return name;
    }

    public String inputAddress() {

        String address = "";
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the address: ");
                Scanner input = new Scanner(System.in);
                address = input.nextLine();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return address;
    }

    public String inputGender() {

        String gender = "";
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the gender: ");
                Scanner input = new Scanner(System.in);
                gender = input.nextLine();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return gender;
    }

    public String inputTime() {

        String time = "";
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the time: ");
                Scanner input = new Scanner(System.in);
                time = input.nextLine();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return time;
    }

    public String inputSpeciality() {

        String speciality = "";
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the speciality: ");
                Scanner input = new Scanner(System.in);
                speciality = input.nextLine();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return speciality;
    }

    public int inputDOB() {

        int DOB = 0;
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the date of birth: ");
                Scanner input = new Scanner(System.in);
                DOB = input.nextInt();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return DOB;
    }

    public int inputID() {

        int ID = 0;
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the id: ");
                Scanner input = new Scanner(System.in);
                ID = input.nextInt();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return ID;
    }


    public long inputPhonenum() {

        long phonenum = 0;
        boolean invalid = true;

        while (invalid) {
            try {
                System.out.println("Enter the phone number: ");
                Scanner input = new Scanner(System.in);
                phonenum = input.nextLong();
                invalid = false;
            } catch (Exception e) {
                inputInvalid();
            }
        }
        return phonenum;
    }
}
