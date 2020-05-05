package Exercises;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill(){
     id = 0;
     baseCost = 29.99;
     allottedMinutes = 600;
     minutesUsed = 600;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 29.99;
        allottedMinutes = 600;
        minutesUsed = 600;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


}
