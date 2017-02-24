package com.logiktech.exp;

/**
 * Created by vinod on 23/02/2017.
 */
public interface Car {

    double engineSize = 2.0;
    double currentSpeed = 0.0;

    void speed();

    public static double brake(int downSpeedTo){
        return (currentSpeed-downSpeedTo);
    }

    public default void stop(){
        //currentSpeed = 0.0;
    }



}
