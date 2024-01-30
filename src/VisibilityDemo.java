class Person{
    int id;
    String Name;
    String Gender;

    private void personalMethod(){
        System.out.println("This method is very personal");
    }


}

public class VisibilityDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 99;
        person.Name = "SUSU";
        person.Gender = "M";


    }
}
