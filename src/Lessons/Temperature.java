package Lessons;

public class Temperature {
    private double  Temp;
    private String Name = "F";

    Temperature (double  Temp,String Name){
        this.Temp = Temp;
        this.Name = Name;

    }

    public double  getTemp(){
    if(this.Name.equals("K")){
        this.Temp = (Temp + 273.15);
    }
    else{
        this.Temp = (Temp * 9/5)+32;
    }

     return this.Temp;
    }


}
