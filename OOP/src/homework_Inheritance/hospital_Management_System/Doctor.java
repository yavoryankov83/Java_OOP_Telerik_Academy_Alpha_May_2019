package homework_Inheritance.hospital_Management_System;

public class Doctor extends Staff {

  private long doctorId;
  private String specialisation;

  public Doctor(String firtName, String lastName, String gender, String email,
                int yearsOfExperience, String description, double salary) {
    super(firtName, lastName, gender, email, yearsOfExperience, description, salary);
    setDoctorId(User.getId());
    setSpecialisation(specialisation);
  }

  public long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(long doctorId) {
    this.doctorId = doctorId;
  }

  public String getSpecialisation() {
    return specialisation;
  }

  public void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }
}
