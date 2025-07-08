/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delta
 */
import java.util.ArrayList;
public class Stack {
    private ArrayList<String> x;
    public Stack(){
        this.x = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.x.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.x.add(value);
    }
    public ArrayList<String> values(){
        return x;
    }
    public String take(){
        String y = this.x.get(x.size()-1);
        this.x.remove(this.x.size()-1);
        return y;
    }
}
