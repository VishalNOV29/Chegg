package FIT2099Clinic;

public class Clinic{
    Patient patients[];
    void createPatients(){
        patients=new Patient[3];
        patients[0]=new Patient("Adam", "Melbourne", "Fever");
        patients[1]=new Patient("Ellen", "Perth", "Coughing");
        patients[2]=new Patient("James", "Sydney", "Headache");

    }
    void displayPatients(){
        for (int i=0;i<patients.length;i++){
            System.out.println("Patient ("+(i+1)+")Details: "+patients[i].toString());
        }
    }
    void runClinic(){
        System.out.println("Welcome to FIT2099 Clinic App");
        createPatients();
        displayPatients();
        System.out.println("Thank you for visiting FIT2099 Clinic App");
    }
    
}
