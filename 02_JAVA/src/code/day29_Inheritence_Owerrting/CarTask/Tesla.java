package code.day29_Inheritence_Owerrting.CarTask;

public class Tesla extends Car{
    //start ,stop ,consume will be inherited

    @Override
    public void consume(){
        System.out.println("consume electric");
    }
}
