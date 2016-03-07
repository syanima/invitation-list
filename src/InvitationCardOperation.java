public class InvitationCardOperation{

    private String data;
    private String guestDetails;

    public InvitationCardOperation(String data) {
        this.data = data;
    }

    public String dataRetrievalOfGuest(String format,String choice) throws Exception {
        guestDetails = "";
        String[] records = data.split("\n");
        for (String record1 : records) {
            String[] record = record1.split(",");
            Name name = new Name(record[0], record[1]);
            Address address = new Address(record[4], record[5], record[6]);
            Person person = new Person(name,address,Integer.parseInt(record[3]));
            guestDetails += choice.equals("withoutCountry") ? (person.getAddressWithCountry(false," ")  +"\n") : (person.getAddressWithCountry(true," ")+"\n");
        }
        return guestDetails;
    }
}
