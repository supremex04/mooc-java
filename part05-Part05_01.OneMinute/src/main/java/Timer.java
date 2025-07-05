/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delta
 */
public class Timer {
    private ClockHand secondth;
    private ClockHand second;
    
    public Timer() {
        this.secondth = new ClockHand(100);
        this.second = new ClockHand(60);
        
        
    }
    public void advance(){
        this.secondth.advance();
        if (this.secondth.value() == 0){
            this.second.advance();
           
        }
    }
    @Override
    public String toString(){
        return second + ":" + secondth;
    }
    
    
}
