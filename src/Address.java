public class Address {
    private final String city,state,country;
    public Address(String city,String state,String country){
        this.country = country;
        this.state = state;
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getCountry(){
        return country;
    }

    public String toString() {
        return city + ", " +
                state + ", " +
                country ;
    }
}
