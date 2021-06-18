import java.util.Objects;

public class Person {
    int Age;
    String Name;

    Person(int age, String name){
        this.Age = age;
        this.Name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)return true;
        if(o==null || getClass() !=o.getClass())return false;
        Person person = (Person) o;
        return Age == person.Age && Name.equals(person.Name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(Age,Name);
    }

    @Override
    public String toString(){
        return "Person{" +
                "age = " + Age +
                ", name = " + Name +
                '\'' + "}";
    }
}
