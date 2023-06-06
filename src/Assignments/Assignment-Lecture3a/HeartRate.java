import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HeartRate {
   final int RHR=70;
   final double LB=0.5;
   final double UB=0.85;
   double LBTHR;

    double UBTHR;
    double AHR;
    String firstName;
    String lastName;
    LocalDate birthDate;

    HeartRate(String firstName,String lastName,LocalDate birthDate)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public LocalDate getBirthDate()
    {
        return birthDate;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setBirthDate(String birthDate)
    {
        LocalDate bd = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.birthDate=bd;
    }
    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public int getMaxHeartRate(int age)
    {
        return (220-age);
    }
    public void TargetHeartRange(double MHR)
    {
        AHR=MHR-RHR;
        LBTHR= (AHR*LB) + RHR;
        UBTHR=(AHR*UB) + RHR;
        System.out.println("The Target Heart Rate Range is between "+ LBTHR + " and "+UBTHR);
    }
    public String toString(int Age,double MHR) {
        return "First Name: " + firstName + "\n" +"Last Name: "+ lastName + "\n"+"Age: "+ Age+"\n"+ "Date of Birth: "+birthDate+"\n"
                +"Maximum Heart Rate: "+MHR;

    }

    public static LocalDate getBirthday() {
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-09-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch(DateTimeParseException e) {
                System.out.println("Error! Invalid date format");
            }
        }
    }

    public static void main(String args[]) {

        String userGivenDate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String Firstname=scanner.nextLine() ;
        System.out.println("Enter Last Name");
        String Lastname=scanner.nextLine() ;

        LocalDate dob=getBirthday();
        HeartRate person=new HeartRate(Firstname, Lastname,dob);

        Period age = person.calculateAge(dob);
        int Ageyear=age.getYears();

        double MHR=person.getMaxHeartRate(Ageyear);
        person.TargetHeartRange(MHR);
        System.out.println(person.toString(Ageyear,MHR));
    }
}
