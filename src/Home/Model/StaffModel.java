package Home.Model;

public class StaffModel {
    
    private int id;
    private String name;
    private String gender;
    private int age;
    private String position;
    private double salary;
    private String contact;
    private String image;
    private String date;

    

   public StaffModel(int id,String name, String gender, int age, String position, double salary, String contact, String image, String date) {
        this.id=id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.contact = contact;
        this.image = image;
        this.date = date;
    }

    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getContact() {
        return contact;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }
      
}
