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
        System.out.printf("Name: %s\nAddress: %s\nGender: %s\nDate of birth: %d\nID: %d\nPhone number: %d\n\n",
                this.getName(), this.getAddress(), this.getGender(), this.getDob(), this.getId(), this.getPhonenum());
    }

    public static int GETNUMPT() {
        return NUMPT;
    }

    public static Patient GETPT(int id) {
        if (NUMPT == 0) {
            System.out.println("Patient does not exist. ");
            return null;
        }
        for (int i = 0; i < NUMPT; i ++) {
            if (PTLIST.get(i).getId() == id) {
                return PTLIST.get(i);
            }
        }
        System.out.println("Patient does not exist. ");
        return null;
    }

    public static boolean REMOVEPT(int id) {
        Patient pt = GETPT(id);
        if (pt == null) {
            return false;
        } else {
            PTLIST.remove(pt);
            NUMPT --;
            return true;
        }
    }

    public static void VIEWALLPT() {
        for (int i = 0; i < NUMPT; i ++) {
            PTLIST.get(i).viewPt();
        }
    }
}
