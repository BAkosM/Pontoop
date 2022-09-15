package hu.petrik.pontoop;
import java.util.Scanner;

import hu.petrik.pontoop.pont.*;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        pont p1 = new pont();
        pont p2 = new pont(0,0);
        pont p3 = new pont(3,4);
        pont p4 = new pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        //tom kiir
        pont[] pontok = new pont[10];
        for(int i = 0; i < pontok.length; i++) {
            pontok[i] = new pont(100);
        }
        for(pont p: pontok ) {
            System.out.println(p);
        }
        //legtavolabb
        int Farest = 0;
        for(int i = 1; i < pontok.length; i++){
            if(pontok[Farest].getRange()<pontok[i].getRange()){
                Farest = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origótól a(z) %d. pont, koordinátái: %s, origótól mért távolsága: %.0f",
        (Farest+1), pontok[Farest], pontok[Farest].getRange());
        
        //ket pont tavolssag
        System.out.println();
        System.out.println("Adjon meg két ponot: ");
        System.out.print("Első: ");     
        int a = sc.nextInt();
        System.out.print(" Második: ");
        int b = sc.nextInt();
        System.out.printf("A %d és %d pont távolsága: %.0f",pontok[a],pontok[b],pontok[a].getTwoRange(pontok[b]));

        //melyik negyed
        System.out.println();
        System.out.println("Adjon meg egy ponot: ");
        int n = sc.nextInt();
        String bj = "";
        if(pontok[n].getX()<0){
            bj = "bal ";
        } else if(pontok[n].getX()>0){
            bj = "jobb ";
        }else{
            bj = "";
        }
        String fl = "";
        if(pontok[n].getY()>0){
            fl = "felső";
        }else if(pontok[n].getY()<0){
            fl = "alsó";
        }else if(pontok[n].getY()==0&&bj.equals("")){
            fl = "origó";
        } else {
            fl = "";
        }
        System.out.print("A "+ pontok[n]+" pont a "+bj + fl+ " négyzetbe van");
    }
}