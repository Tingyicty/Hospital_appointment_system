package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Appointment {

    private String time;
    private Patient patient;
    private Doctor doctor;

    public static ArrayList<Appointment> APLIST = new ArrayList<>();
    private static int NUMAP = 0;

    public Appointment(String time, Patient patient, Doctor doctor) {
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
        NUMAP ++;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void viewAp() {
        System.out.printf("Name: %s\nTime: %s\nWith: Dr. %s\n",
                this.patient.getName(), this.time, this.doctor.getName());
    }

    public static int GETNUMAP() {
        return NUMAP;
    }

    public static Appointment GETAP(Patient pt) {
        if (NUMAP == 0) {
            System.out.println("Appointment does not exist. ");
            return null;
        }
        for (int i = 0; i < APLIST.size(); i ++) {
            if (APLIST.get(i).getPatient() == pt) {
                return APLIST.get(i);
            }
        }
        System.out.println("Appointment does not exist. ");
        return null;
    }

    public static boolean REMOVEAP(Patient pt) {
        if (GETAP(pt) == null) {
            return false;
        } else {
            APLIST.remove(GETAP(pt));
            NUMAP --;
            return true;
        }
    }

    public static void VIEWALLAP() {
        for (int i = 0; i < NUMAP; i ++) {
            APLIST.get(i).viewAp();
        }
    }
}
