package Classes;

import java.util.ArrayList;

public class Doctor extends Person{

    private String speciality;
    private int[] availability;

    public static ArrayList<Doctor> DCLIST = new ArrayList<>();
    private static int NUMDC = 0;


    public Doctor(String name, String speciality, int id, long phonenum) {
        super(name, phonenum, id);
        this.speciality = speciality;
        availability = new int[] {};
        NUMDC ++;
    }

    public void viewDc() {
        System.out.printf("Name: Dr. %s\nSpeciality: %s\nID: %d\nPhone number: %d",
                this.getName(), this.speciality, this.getId(), this.getPhonenum());
    }

    public static int GETNUMDC() {
        return NUMDC;
    }

    public static Doctor GETDC(int id) {
        for (int i = 0; i < DCLIST.size(); i ++) {
            if (DCLIST.get(i).getId() == id) {
                return DCLIST.get(i);
            }
        }
        System.out.println("Doctor does not exist. ");
        return null;
    }

    public static void REMOVEDC(int id) {
        if (GETDC(id) == null) {
            System.out.println("Doctor does not exist. ");
        } else {
            DCLIST.remove(id);
        }
    }
}
