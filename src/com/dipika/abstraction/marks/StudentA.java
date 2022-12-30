package com.dipika.abstraction.marks;

public class StudentA extends Marks{
    private  int mark1;
    private  int mark2;
    private  int mark3;

    public StudentA(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public float getPercentage() {
        float total= mark1+mark2+mark3;
       // int percentage= (total/300)*100;
        return(total/300)*100 ;
    }
}
