package Basics.Association;

public class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information info;
    Payment pay;

    public Patient(String patientName, String disease, int patientAge, String doa,Information info , Payment pay) {

        this.patientName = patientName;
        this.disease = disease;
        this.patientAge = patientAge;
        this.doa = doa;
        this.info=info;
        this.pay = pay;
    }
    public void patientDetails(){
        System.out.println("Name: "+ this.patientName );
        System.out.println("Age : "+this.patientAge );
        System.out.println("Date of arrival :" + this.doa);
        System.out.println("Disease : " + this.disease);
        System.out.println("Block No:" +this.info.blockNo );
        System.out.println("Floor No: "+this.info.floorNo);
        System.out.println("Room No : "+this.info.roomNo);
        System.out.println("Bed No : " + this.info.bedNo);
        System.out.println("Reg Fees : "+this.pay.regFees);
        System.out.println("Adm fees : "+this.pay.admFees);
        System.out.println("Balance Amount: "+this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info = new Information("C" , 3 , 301 , 4);
        Payment pay = new Payment(3000,20000,5000);
        Patient p1 = new Patient("ABC" , "Jaundice" , 21,"11/06/2025",info,pay);
        p1.patientDetails();
    }
}
