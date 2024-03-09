package com.ucsc.automation.basicautomation.exceptionex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {
        try{
            double value=Math.random();
            if(value>=0.5 {
                throw new RuntimeException();
            }
            System.out.println("print try end");
        }catch (NumberFormatException nex){
            System.out.println("number format exception");
        }
    }
        public void display()throws Exception{
        try {
            System.out.println("something");
        }catch (Exception ex) {
            System.out.println();

        }
    }

        public void readText(){
        try(Scanner scanner=new Scanner(new File("name.txt"))){
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch(FileNotFoundException fex) {
            fex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
