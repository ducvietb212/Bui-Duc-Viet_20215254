package OOP_Lab1.ex6_5;

public class Year {
    private int y;
    public Year(int y){
        this.y=y;
    }
    public void setYear(int y){
        this.y=y;
    }
    public int getYear(){
        return y;
    }
    public boolean checkLeapYear(){
        if(y%4==0){
            if(y%100==0&&y%400!=0){
                return false;
            }
            else if(y%400==0){
                return true;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
