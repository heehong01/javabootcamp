package com.heejinhong.InClass;

public class UseGeneric {
    //Genericized Functional Abstraction with Lambda
    public static void main(String[] args) {
        InterfaceGeneric<Float> nums = (Float o1, Float o2) -> {
            if (o1 > o2) {
                return o1;
            } else {
                return o2;
            }
        };
        Float max = nums.compare(34F, 100F);
        System.out.println(max);
    }

    /* Genericized Functional Abstraction without Lambda
    public static void main(String[] args) {
        InterfaceGeneric<Float> nums = new InterfaceGeneric<Float>(){
            @Override
            public Float compare(Float o1, Float o2){
                if(o1 > o2){
                    return o1;
                }
                else{
                    return o2;
                }
            }
        };
        Float max = nums.compare(34F, 100F);
        System.out.println(max);
    }*/

}
@FunctionalInterface
interface InterfaceGeneric<T> {
    T compare(T o1, T o2);
}

