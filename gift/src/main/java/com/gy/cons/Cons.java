package com.gy.cons;

public class Cons {
    private static ThreadLocal<Integer> CURRENT_ARAE = new ThreadLocal<>();

    public static void setCurrentArea(Integer area){
        CURRENT_ARAE.remove();
        CURRENT_ARAE.set(area);
    }

    public static Integer getCurrentArea(){
        Integer area = CURRENT_ARAE.get();
        return area;
    }



}
