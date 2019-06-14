public class Doctor extends Staff {

  private String specialisation;

  public Doctor(long id, String firtName, String lastName, String gender,
                String email, int yearsOfExperience, String description,
                double salary, String specialisation) {
    super(id, firtName, lastName, gender, email, yearsOfExperience, description, salary);
    setSpecialisation(specialisation);
  }

  public String getSpecialisation() {
    return specialisation;
  }

  private void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }
}
