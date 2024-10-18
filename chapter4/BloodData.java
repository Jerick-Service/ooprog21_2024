public class TestBloodData {
    public static void main(String[] args) {
        BloodData patient1 = new BloodData();
        patient1.displayBloodInfo();  // should show default "O" and "+"
        
        patient1.setBloodType("B");
        patient1.setRhFactor("-");
        patient1.displayBloodInfo();  // should show updated "B" and "-"
        
        patient1.defaultPatient();
        patient1.displayBloodInfo();  // should show "A" and "-"
    }
}

public class BloodData {
    String bloodType;
    String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType + rhFactor);
        
    }
}
