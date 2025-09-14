public class OOPS {
    public static void main(String args[]){
    Fish tuna=new Fish();
    tuna.eat();

}
    /*public static void main(String args[]){
        Pen p1=new Pen();

    }*/
    
}
/*class Pen{
    //prop + func
    String color;
    int tip;

    Pen(){
        System.out.println("The color is blue");
    }
}*/


class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }

}
