package Classes;

import java.util.ArrayList;

public class Patient extends Person {

    private String address;
    private String gender;
    private int dob;

    public static ArrayList<Patient> PTLIST = new ArrayList<>();
    private static int NUMPT = 0;

    public Patient(String name, String address, String gender, int dob, long phonenum, int id) {
        super(name, phonenum, id);
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        NUMPT ++;
    }

    public String getAddress() {
        return this.address;
    }

    public String getGender() {
        return this.gender;
    }

    public int getDob() {
        return this.dob;
    }

    public void viewPt() {
        System.out.printf("Name: %s\nAddress: %s\nGender: %s\nDate of birth: %d\nID: %d\nPhone number: %d",
                this.getName(), this.getAddress(), this.getGender(), this.getDob(), this.getId(), this.getPhonenum());
    }

    public static int GETNUMPT() {
        return NUMPT;
    }

    public static Patient GETPT(int id) {
        for (int i = 0; i < PTLIST.size(); i ++) {
            if (PTLIST.get(i).getId() == id) {
                return PTLIST.get(i);
            }
        }
        System.out.println("Patient does not exist. ");
        return null;
    }

    public static void REMOVEPT(int id) {
        if (GETPT(id) == null) {
            System.out.println("Patient does not exist. ");
        } else {
            PTLIST.remove(id);
        }
    }
}
