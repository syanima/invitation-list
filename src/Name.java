/**
 * Created by syanima on 01/03/16.
 */
public class Name {
    protected String firstName;
    protected String lastName;
    protected String suffix;

    public Name(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.suffix = "";
    }
    public String firstLast(String seperator){
        return suffix+firstName+seperator+lastName;
    }
    public String lastFirst(String seperator){
        return suffix+lastName+seperator+firstName;
    }

    public void addSuffixMr(){
        this.suffix = "Mr ";
    }

    public void addSuffixMs(){
        this.suffix = "Ms ";
    }
}
