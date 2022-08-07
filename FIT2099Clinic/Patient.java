package FIT2099Clinic;

public class Patient extends Person {
    String caseDescription;

    Patient(String name, String add, String caseD) {
        super(name, add);
        caseDescription = caseD;
    }

    void setCaseDescription(String caseD) {
        caseDescription = caseD;
    }

    String getCaseDescription() {
        return caseDescription;
    }
    public String toString(){
        return super.toString()+" , case: "+caseDescription;

    }

}
