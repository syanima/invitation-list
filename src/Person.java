public class Person {
    protected Name name;
    protected Address address;
    protected int age;

    public Person(Name name,Address address,int age){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String getNameByChoice(boolean choice, String separator) {
        return (choice) ? name.firstLast(separator) : name.lastFirst(separator);
    }

    public String getAddress() {
        return getAddress(true, " ");
    }

    public String getAddress(boolean firstNameFirst, String separator) {
        String name = getNameByChoice(firstNameFirst, separator);
        return name + "\n" + address.toString();
    }

    public String getAddressWithCountry() {
        return getAddressWithCountry(true, " ");
    }

    public String getAddressWithCountry(boolean firstNameFirst, String separator) {
        String name = getNameByChoice(firstNameFirst, separator);
        return name + ", " + address.getCountry();
    }

}
