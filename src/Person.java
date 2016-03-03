public class Person {
    protected Name name;
    protected Address address;
    protected int age;

    public Person(Name name,Address address,int age){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getNameWithFirstAndLast(String seperator){
        return name.firstLast(seperator);
    }

    public String getNameWithLastAndFirst(String seperator){
        return name.lastFirst(seperator);
    }
}
