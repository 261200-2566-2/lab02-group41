import java.util.Scanner;

public class AirP {

    
    String brand;  //instance variable

    boolean power_on;  //instance variable

    String sn;  //instance variable

    int aqi;  //instance variable

    boolean savemode;  //instance variable
    
    //instance methods
    //input = none
    //output = none
    //overview = ถ้าผู้ใช้ไม่ใส่อะไรเลย power on = false / savemode =false
    public AirP(){
        power_on = false;
        savemode = false;
    }

    //instance methods
    //input = aqiinput
    //output = message
    //overview = คำนวณค่าที่ได้จาก user
    public void AQIcalculator(int aqi){
    if(aqi > 200){
        System.out.println ("This air is Affects health" );
    }else if(aqi <= 200 && aqi >= 101){
        System.out.println ("This air is Starting to affect health" );       
    }else if(aqi <= 100 && aqi >= 51){
        System.out.println("This air is Medium");
    }else if(aqi <= 50 && aqi >= 26){
        System.out.println("This air is good");
    }else if(aqi <= 25 && aqi >= 0){
         System.out.println("This air is very good");
    }
}

    //instance methods
    //input = none
    //output = none
    //overview = ทำการเปิดเครื่องเมื่อเรียกใช้
    void turn_on(){
        power_on = true;
        savemode = false;
        System.out.println("Airpurifier is on!!!");

    }
    //instance methods
    //input = none
    //output = none
    //overview = ทำการปิดเครื่องเมื่อเรียกใช้
    void turn_off(){
        power_on = false;
        savemode = false;
        System.out.println("Airpurifier is off!!!");
    }
    //instance methods
    //input = none
    //output = none
    //overview = เปิดโหมดประหยัดพลังงานเมื่อเรียกใช้
    void savepowermode_on(){
        savemode = true;
        System.out.println("Savemode is on");
    }
    //instance methods
    //input = none
    //output = none
    //overview = ปิดโหมดประหยัดพลังงานเมื่อเรียกใช้
    void savepowermode_off(){
        savemode = false;
        System.out.println("Savemode is off");
    }
    //instance methods
    //input = brand sn aqi
    //output = none
    //overview = รับค่ามาและนำค่ามาใช้
    AirP(String brand ,String sn ,int aqi ){
        this.brand = brand;
        this.sn = sn;
        this.aqi = aqi;
        
    }
    //instance methods
    //input = brand ,sn ,aqi
    //output = message
    //overview = นำค่าที่ได้มาใส่ message
    public void displaystatus(){
        System.out.println("Brand = "+this.brand);
        System.out.println("Serial number = "+this.sn);
        System.out.println("AQI = "+this.aqi);
        System.out.println("___________________");
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
    public void setsn(String sn){
        this.sn = sn;
    }
    public void setaqi(int aqi){
        this.aqi = aqi;
    }
    //instance methods
    //input = user input
    //output = none
    //overview = รับค่า AQI จากผู้ใช้
    public static int aqiinput(Scanner scanner){
        System.out.print("Input AQI:");
        return scanner.nextInt();
    }

    private static String mostPopularBrand = "HEE is mostPopularBrand"; //class variable


    

    //input = mostPopularBrand
    //output = brand
    //overview = รับค่าจาก  mostPopularBrand มาแสดง
    public static String getMostPopularBrand() {  // class methods
        return mostPopularBrand;
    }

    public static void setMostPopularBrand(String brand) { // class methods
        mostPopularBrand = brand;
    }
    }