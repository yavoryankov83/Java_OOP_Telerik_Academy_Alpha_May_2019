package lab_Inheritance.hospital_Management_System;

public class Patient extends User {

  private long patientId;
  private boolean insured;

  public Patient(String firtName, String lastName, String gender, String email,
                 boolean insured) {
    super(firtName, lastName, gender, email);

    setPatientId(User.getId());
    setInsured(insured);
  }

  public long getPatientId() {
    return patientId;
  }

  public void setPatientId(long patientId) {
    this.patientId = patientId;
  }

  public boolean isInsured() {
    return insured;
  }

  public void setInsured(boolean insured) {
    this.insured = insured;
  }
}
