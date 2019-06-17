package homework_Inheritance;

public class Nurse extends Staff {

  private long nurseId;

  public Nurse(String firtName, String lastName, String gender, String email, int yearsOfExperience,
               String description, double salary) {
    super(firtName, lastName, gender, email, yearsOfExperience, description, salary);
    setNurseId(User.getId());
  }

  public long getNurseId() {
    return nurseId;
  }

  public void setNurseId(long nurseId) {
    this.nurseId = nurseId;
  }
}
