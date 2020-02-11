package com;

public class One {
    String go = "walk";

    static class Two extends One{
        String go = "fly";
    }

    public static void main(String args[]) {
        One f = new Two();
        Two d = new Two();
        System.out.println(f.go + d.go);
    }

}

