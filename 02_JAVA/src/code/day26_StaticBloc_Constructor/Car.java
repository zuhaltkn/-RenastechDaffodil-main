package code.day26_StaticBloc_Constructor;

public class Car {

   // Even if you don't create one constructor java will create one as default.

    // instance variables
    String brand;
    int year;
    double price;
    String color;

    //constructor
//<<<<<<< HEAD
    //we need access modifier and class name in order to create a constructor.
    //ex1:
//=======
    //we need access modifier and class name in order to create a constructor
    //ex 1 :
//>>>>>>> 028c78cc4b9834e218a1c35e4ea950635a31d56d
    public Car(String brand, int year, double price, String color){ // 4 parameters
        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;
    }
//<<<<<<< HEAD
    //ex2:
//=======

    //ex:2
//>>>>>>> 028c78cc4b9834e218a1c35e4ea950635a31d56d
    public Car(String brand, int year){// 2 parameters

        //this keyword used to point instance variable in the class
        this.brand=brand;
        this.year=year;

    }

    // convert object to String and will return object as String.
    public String toString(){
        return year+" , "+brand+" , "+color+" , "+price;
    }


    public void getCarBrandAndYear(){
        System.out.println("brand is " +brand);
        System.out.println("Year is " + year);
    }




}
