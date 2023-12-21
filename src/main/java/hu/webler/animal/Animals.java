package hu.webler.animal;

public class Animals {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void sound() {
        System.out.println("The animal makes a sound");
    }
}
