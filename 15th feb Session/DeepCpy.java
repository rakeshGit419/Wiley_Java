class Location{
    String street;
    String city;

    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location [city=" + city + ", street=" + street + "]";
    }
}
class Address{
    Location location;
    String state;
    String country;
    @Override
    public String toString() {
        return "Address [country=" + country + ", location=" + location + ", state=" + state + "]";
    }
    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    } 
}
class UPIPaymentApps implements Cloneable {
    String name;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfOfficeLocation;

    public UPIPaymentApps(String name, int dailyLimit, double maxDailyAmount,Address headOfOfficeLocation) {
        this.name = name;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfOfficeLocation = headOfOfficeLocation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Location newDependency = new Location(this.headOfOfficeLocation.location.street,this.headOfOfficeLocation.location.city);
        Address newDependencyObj = new Address(newDependency,this.headOfOfficeLocation.state,this.headOfOfficeLocation.country);
        return new UPIPaymentApps(this.name, this.dailyLimit,this.maxDailyAmount,newDependencyObj);
    }
    @Override
    public String toString() {
        return "UPIPaymentApps [dailyLimit=" + dailyLimit + ", headOfOfficeLocation="
                + headOfOfficeLocation + ", maxDailyAmount=" + maxDailyAmount + ", name=" + name + "]";
    }   
}
public class DeepCpy{
    public static void main(String[] args) throws CloneNotSupportedException {
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", 10000, 100000,new Address(new Location("Attapur","Hyderabad"),"Telangana","India"));
        System.out.println(bhim);  // before DeepCopy

        UPIPaymentApps Paytm = (UPIPaymentApps)bhim.clone();
        Paytm.name = "Paytm";
        System.out.println(Paytm);  // city = hyderabad & state = Telangana

        Paytm.headOfOfficeLocation.location.city = "Mumbai";
        Paytm.headOfOfficeLocation.state = "Maharashtra";
        
        System.out.println(Paytm); // city = Mumbai & state = Maharashtra
        System.out.println(bhim.headOfOfficeLocation.state);
    }
}