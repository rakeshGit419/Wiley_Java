class UPIPaymentApps implements Cloneable {
    String name;
    String country;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfOfficeLocation;

    

    public UPIPaymentApps(String name, String country, int dailyLimit, double maxDailyAmount,Address headOfOfficeLocation) {
        this.name = name;
        this.country = country;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfOfficeLocation = headOfOfficeLocation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        System.out.println(headOfOfficeLocation);
        return "UPIPaymentApps [country=" + country + ", dailyLimit=" + dailyLimit + ", maxDailyAmount=" + maxDailyAmount + ", name=" + name + "]";
    }

    
}

public class UPIDriver {
    public static void main(String[] args) throws Exception {
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", "India", 10000, 100000,new Address(new Location("Attapur","Hyderabad"),"TS","India"));
        System.out.println(bhim);

        // // not a copy, but an impostor
        // UPIPaymentApps phonePe = (UPIPaymentApps)bhim.clone();
        // phonePe.name = "PhonePe";
        // System.out.println(phonePe);
        // // shallow copy
        // UPIPaymentApps gPay = (UPIPaymentApps) bhim.clone();
        // gPay.name = "GPay";
        // System.out.println(gPay);

    }
}