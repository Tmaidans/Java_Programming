package dailyClasses.day34_abstraction.animalTask;

public interface Playable {

   boolean isFriendly = true; //public, static and final

//    public static void main(String[] args) {
//        System.out.println(isFriendly); //proof that variable is static - only static methods can only access static variables
//    }

//  default void method1 (){} // default methods become instance methods when it gets inherited by subclass

    public abstract void play(); //access modifier and abstract keyword are redundant - method already has it by default
}
