public class Address
{
    // Nome da Rua
    private String StreetName;

    public String getStreetName() {
        return StreetName;
    }
    public void setStreetName(String streetName) {
        this.StreetName = streetName;
    }

    // Numero da porta
    private Integer DoorNo;

    public Integer getDoorNo() {
        return DoorNo;
    }
    public void setDoorNo(Integer doorNo) {
        this.DoorNo = doorNo;
    }

    // codigo postal
    private String PostalCode;

    public String getPostalCode() {
        return PostalCode;
    }
    public void setPostalCode(String postalCode) {
        this.PostalCode = postalCode;
    }

    //construtorees

    public Address(String streetName, Integer doorNo, String postalCode) {
        StreetName = streetName;
        DoorNo = doorNo;
        PostalCode = postalCode;
    }
}
