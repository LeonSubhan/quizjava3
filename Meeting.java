package quiz_java_03;

public class Meeting {

    String time;
    String  location;
    String subject;

    public Meeting(){

    }
    public void setTime(String time){
        this.time = time;

    }
    public void setLocation (String location){
        this.location = location;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        subject = "Examiners meeting";
        return subject;
    }
    public void printDetails(){

        System.out.println("Meeting in " + location + " at " + time + " Subject " + subject);
    }
    public static void main(String[] args) {
        Meeting mt = new Meeting();
        mt.setTime("12:30");
        mt.setLocation("Room 205");
        mt.getSubject();
        mt.printDetails();
    }


}
