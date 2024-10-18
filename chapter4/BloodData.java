public class TestBloodData {
    public static void main(String[] args) {
        BloodData patient = new BloodData(); 
        patient.setBloodType("B"); 
        patient.setRhFactor("+");   

        patient.displayBloodInfo(); 
    }
}                                                                                  




public class BloodData {
    
    private String bloodType;
    private String rhFactor;

    
    public BloodData() {
        defaultPatient();
    }

    
    public void defaultPatient() {
        this.bloodType = "A"; 
        this.rhFactor = "-";  
    }

    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    
    public void displayBloodInfo() {
        System.out.printf("Blood Type: %s, Rh Factor: %s%n", bloodType, rhFactor);
    }
}
