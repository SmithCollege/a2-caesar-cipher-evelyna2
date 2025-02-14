// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] array;
    private int high;
    private int low;
    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int len){
        this.array = Array.newInstance();

    }
    // Now implement the methods from IndexAccess?

}