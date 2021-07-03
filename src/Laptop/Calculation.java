package Laptop;

import java.util.ArrayList;

public class Calculation {

     /*
        Create method name is getRam

        Parameter is

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */
    public static int getRam(ArrayList<String> list){
        int price=0;
        for (String s : list) {
            if (s.contains("32 gb")) price += 300;
            if (s.contains("16 gb")) price += 200;
            if (s.contains("8 gb")) price += 100;
            if (s.contains("4 gb")) price += 50;
        }

       return price;

    }


     /*
        getRam methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle


        return  price olmalı.

        Not price -- fiyat
     */

    /*
       Create method name is getCPU

        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */
    public static int getCPU(ArrayList<String> list){
        int price=0;
        for (String s : list) {
        if (s.contains("i3")) price+=200;
        if (s.contains("i5")) price+=300;
        if (s.contains("i7")) price+=500;}


        return price;

    }


      /*
        getCPU  methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle


        return  price olmalı.
     */



    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */
    public static int getColor(ArrayList<String> list){
        int price=0;
        for (String s : list) {
        if (s.contains("Red")) price+=400;
        if (s.contains("Orange")) price+=300;
        if (s.contains("Silver")) price+=200;
        if (s.contains("Black")) price+=150;}

        return price;}

     /*
        getColor methodunu oluşturalım

        Parametresi  ArrayList<String> olsun

        return türü int olmalı


        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle


        return  price olmalı.

     */



    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */
        public static int getSize(ArrayList<String> list){
            int price=0;
            for (String s : list) {
            if (s.contains("Mini")) price+=100;
            if (s.contains("Middle")) price+=200;
            if (s.contains("Max")) price+=300;}


            return price;

        }

    /*
        getSize  methodunu oluşturalım

        return türü int olmalı

        Parametresi  ArrayList<String> olsun


        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle


        return  price olmalı.
     */



}
