/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delta
 */
public class Counter {
    
    private int x;
    
    public Counter(int startValue){
        this.x = startValue;
    }
    
    public Counter(){
        this(0);
       
    }
    public int value(){
        return x;
    }

    public void increase(){
        this.x +=1;
    }
    public void decrease(){
        this.x -=1;
    }
    public void increase(int increaseBy){
        if (increaseBy<0){return;}
        this.x += increaseBy;
    }
    public void decrease(int decreaseBy){
        if (decreaseBy<0){return;}
        this.x -= decreaseBy;
    }
}
