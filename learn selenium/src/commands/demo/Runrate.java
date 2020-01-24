package commands.demo;

import java.io.*;
import java.util.*;
public class Runrate{
    Scanner scan=new Scanner(System.in);
    float runs, overs, runRate,reqRunrate;
    public void input(){
        try{
            System.out.println("Enter Runs Scored: ");
            runs=scan.nextFloat();
            System.out.println("no.of overs: ");
            overs=scan.nextFloat();
        }
        catch(NumberFormatException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void compute(){
       float runRate=runs/overs;
        System.out.println("Score is "+runs+" runs in "+overs+" balls with the Run Rate of "+runRate+" runs per over.");
    reqRunrate=(runs+1)/overs;
    System.out.println("reqRunrate is:"+reqRunrate);
    
    }

    public static void main(String[] args){
        Runrate obj=new Runrate();
        obj.input();
        obj.compute();
    }
}