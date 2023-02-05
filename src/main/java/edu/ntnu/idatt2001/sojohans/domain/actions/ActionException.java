package edu.ntnu.idatt2001.sojohans.domain.actions;

public class ActionException extends RuntimeException{

    public ActionException(String errorMessage){
        super(errorMessage);
    }
}
