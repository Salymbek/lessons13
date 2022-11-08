import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] lessons={"English","Java","Soft-Skills"};

        MyClass myClass=new MyClass("Salymbek","Khadzhakeldyev",16, lessons,"plov" );

        MyClass myClass1=new MyClass();
        myClass1.setName("Myrza");
        myClass1.setSurname("Umarov");
        myClass1.setAge(16);
        myClass1.setLessons(lessons);
        myClass1.setFood("sup");

        System.out.println(myClass1.getName()+"\n"+myClass1.getSurname()+
                "\n"+myClass1.getAge()+"\n"+ Arrays.toString(myClass1.getLessons(lessons))+"\n"+myClass1.getFood());
        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+
                "\n"+myClass.getAge()+"\n"+ Arrays.toString(myClass.getLessons(lessons))+"\n"+myClass.getFood());




    }











}