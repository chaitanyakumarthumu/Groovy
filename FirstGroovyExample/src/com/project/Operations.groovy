package com.project

class Operations {
    public static void main(String[] args) {
        def a=1..8
        println(a)

        def x=5
        while(x<=30) {
            println(x)
            x+=5
        }

        //for loop
        for(def i=0;i<=10;i++)
        {
            println(i)
        }
        //for in
        for(def i in 5..12)
        {
            print(i)
        }

        int[] intArray=[1, 2, 3, 4, 5]
        println("int array leantg is : "+intArray.length)
        for(int i in intArray) {
            println("array : "+i)
            if(i==3)
            {
                break
            }
        }
    }
}