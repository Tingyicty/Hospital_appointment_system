package Classes;

public abstract class Person {

    private String name;
    private long phonenum;
    private int id;

    public Person(String name, long phonenum, int id) {
        this.name = name;
        this.phonenum = phonenum;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public int getId() {
        return id;
    }
}
