public class Dog {
    private String name;
    private int age;
    private String agestring;

    Dog(){
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    private void age() {
        age = age * 7;
    }

    @Override
    public String toString() {
        age();
        agestring = Integer.toString(age);
        return "Dog{" +
                "name='" + name + '\'' +
                ", agestring='" + agestring + '\'' +
                '}';
    }
}
