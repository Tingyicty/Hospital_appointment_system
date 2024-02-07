package Classes;

import java.util.Scanner;

import static Classes.Appointment.*;
import static Classes.Doctor.*;
import static Classes.Patient.*;

public class Menu {

    private static final String MENUSTRING = "Welcome to Tingyi's Hospital Appointment System!\n" +
            "Which category do you need help with?\n" +
            "Please choose one of the following options to proceed.\n" +
            "[A] or [B] or [C] or [X]\n\n" +
            "A: Create/Remove/View a patient's file\n" +
            "B: Create/Remove/View a doctor's file\n" +
            "C: Create/Remove/View an appointment\n" +
            "X: Exit";

    private static final String SUBMENUSTRING = "Please choose one of the following options to proceed.\n" +
            "[1] or [2] or [3] or [B]\n\n" +
            "1: Create\n" +
            "2: Remove\n" +
            "3: View\n" +
            "B: Back to main menu";

    private static final String INVALID = "Input not valid. Please try again.";

    public static void SUBMENU(String choice) {

        InputHandler helper = new InputHandler();
        Scanner input = new Scanner(System.in);
        System.out.println(SUBMENUSTRING);
        String subchoice = input.nextLine();

        if (choice.equals("A")) {

            System.out.println("Patient's File Menu");

            while (!subchoice.equals("B")) {

                if (subchoice.equals("1")) {

                    String name = helper.inputName();
                    String address = helper.inputAddress();
                    String gender = helper.inputGender();
                    int dob = helper.inputDOB();
                    long phonenum = helper.inputPhonenum();
                    int id = helper.inputID();
                    PTLIST.add(new Patient(name, address, gender, dob, phonenum,id));
                    System.out.printf("Patient %d added. ", id);

                } else if (subchoice.equals("2")) {

                    int id = helper.inputID();
                    REMOVEPT(id);
                    System.out.printf("Patient %d removed. ", id);

                } else if (subchoice.equals("3")) {

                    int id = helper.inputID();
                    GETPT(id).viewPt();

                } else {
                    System.out.println(INVALID);
                }

                Scanner newinput = new Scanner(System.in);
                System.out.println(SUBMENUSTRING);
                subchoice = newinput.nextLine();
            }

        } else if (choice.equals("B")) {

            System.out.println("Doctor's File Menu");

            while (!subchoice.equals("B")) {

                if (subchoice.equals("1")) {

                    String name = helper.inputName();
                    String speciality = helper.inputSpeciality();
                    long phonenum = helper.inputPhonenum();
                    int id = helper.inputID();
                    DCLIST.add(new Doctor(name, speciality, id, phonenum));
                    System.out.printf("Doctor %d added. ", id);

                } else if (subchoice.equals("2")) {

                    int id = helper.inputID();
                    REMOVEDC(id);
                    System.out.printf("Doctor %d removed. ", id);

                } else if (subchoice.equals("3")) {

                    int id = helper.inputID();
                    GETDC(id).viewDc();

                } else {
                    System.out.println(INVALID);
                }

                Scanner newinput = new Scanner(System.in);
                System.out.println(SUBMENUSTRING);
                subchoice = newinput.nextLine();
            }

        } else if (choice.equals("C")) {

            System.out.println("Appointment Menu");

            while (!subchoice.equals("B")) {

                if (subchoice.equals("1")) {

                    int ptid = helper.inputID();
                    int dcid = helper.inputID();
                    String time = helper.inputTime();
                    Patient pt = GETPT(ptid);
                    Doctor dc = GETDC(dcid);
                    APLIST.add(new Appointment(time, pt, dc));
                    System.out.println("Appointment added. ");

                } else if (subchoice.equals("2")) {

                    int id = helper.inputID(); // pt id
                    REMOVEAP(GETPT(id));
                    System.out.printf("Appointment with patient id%d removed. ", id);

                } else if (subchoice.equals("3")) {

                    int id = helper.inputID();
                    GETAP(GETPT(id)).viewAp();

                } else {
                    System.out.println(INVALID);
                }

                Scanner newinput = new Scanner(System.in);
                System.out.println(SUBMENUSTRING);
                subchoice = newinput.nextLine();
            }
        }
    }
            public static void MENU () {

                Scanner input = new Scanner(System.in);
                System.out.println(MENUSTRING);
                String choice = input.nextLine();

                while (!choice.equals("X")) {
                    if (choice.equals("A")) {

                        SUBMENU("A");

                    } else if (choice.equals("B")) {

                        SUBMENU("B");

                    } else if (choice.equals("C")) {

                        SUBMENU("C");

                    } else {
                        System.out.println(INVALID);
                    }

                    Scanner newinput = new Scanner(System.in);
                    System.out.println(MENUSTRING);
                    choice = newinput.nextLine();

                }
                System.out.println("Terminated.");
            }
}
