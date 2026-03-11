package org.example.atividade2;

public class Main {
    public static void main(String[] args) {

        PF pf = new PF("Alvaro", "71987331646", "97245455635", "97245455635", "23/02/2000");
        PJ pj = new PJ("SENAI", "71934455645", "15151515141554", "12");

        System.out.println(pf.toString());
        System.out.println(pj.toString());

    }
}
