package Chapter11_InheritanceAndPolymorphism;

public class TestHomework {
    public static void main(String[] args) {
        Integer[] list1 = {12, 24, 2, 4};
        Double[] list2 = {2.4, 3.8, 2.9};
        int[] list3 = {1, 2,3};
        printArray(list1);
        printArray(list2);
        //printArray(list3); Compile error: we cannot assign new int[50] into a variable of Object[] type.
    }
    public static void printArray(Object[] list){
        for(Object o: list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
