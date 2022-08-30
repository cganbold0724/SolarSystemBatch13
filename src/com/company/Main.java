package com.company;

public class Main {
    public static void main(String[] args) {
        //write code here
        System.out.println("Hello world!");
        solarSystem inception=new solarSystem();
        inception.Sun=1;
        inception.Planet=2;
        inception.Moon=4;

        System.out.println("the basic structure is ready");

        //developing the feature SUN
        SUN omaro =new SUN();
        omaro.color="pink";
        omaro.name="ferro";
        omaro.radius=123654654;
        omaro.temperature="15161616516";

      //planet2
        Planet2 superwomen = new Planet2();
        superwomen.color="green";
        superwomen.size="324323km";
        superwomen.name="liena";

        //developing planet1
        Planet1 superplanet = new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="545488km";

    }
}
