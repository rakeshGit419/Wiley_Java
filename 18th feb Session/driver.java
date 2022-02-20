import java.util.Scanner;

class Client{
    private int clientId;
    private String clientName;
    private String passportNumber;
    public int getClientId() {
        return clientId;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    
}

class Agent extends Client{
    private String agencyName;

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    
    public void displayDetails(){
        System.out.println("Client ID : "+getClientId());
        System.out.println("Client Name : "+getClientName());
        System.out.println("Passport Number : "+getPassportNumber());
        System.out.println("Agency Name : "+getAgencyName());
    }
}

public class driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agent agent = new Agent();

        int clientId = scanner.nextInt();
        agent.setClientId(clientId);

        String clientName = scanner.next();
        agent.setClientName(clientName);

        String passportNumber = scanner.next();
        agent.setPassportNumber(passportNumber);

        String agencyName = scanner.next();
        agent.setAgencyName(agencyName);

        agent.displayDetails();

    }
}
