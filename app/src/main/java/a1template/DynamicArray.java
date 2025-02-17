// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // Attributes of DynamicArray
    // Uninitialized array of generic type, int for highest index, int for lowest index
    private T[] array;
    private int offset;
    private int high;
    private int low;

    /**
     * Constructs a DynamicArray object of length len and generic type
     * @param len int for length of array
     */
    @SuppressWarnings("unchecked")
    public DynamicArray(int offset, T[] arrayT){
        this.offset = offset;
        this.array = (T[]) new Object[arrayT.length];
        for(int i = 0; i<arrayT.length; i++){
            this.array[i]=arrayT[i];
        }

    }

    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        return this.array[i];
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        return this.array[i+offset];
    }

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T newValue){
        this.array[i]= newValue;
    }
}