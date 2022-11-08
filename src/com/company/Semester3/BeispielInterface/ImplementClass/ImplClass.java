package com.company.Semester3.BeispielInterface.ImplementClass;

public class ImplClass implements IF1, IF2 {
    public static void main(String[] args) {
        ImplClass ic = null;
        // Nicht erlaubt: System.out.println(ic.KONST);
        // Nicht erlaubt: System.out.println(ImplementClass.ImplClass.KONST);
        System.out.println(((IF1)ic).KONST);
        System.out.println(IF1.KONST);
    }
}
