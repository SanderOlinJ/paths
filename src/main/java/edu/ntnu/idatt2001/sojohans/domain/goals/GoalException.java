package edu.ntnu.idatt2001.sojohans.domain.goals;

public class GoalException extends RuntimeException{

    public GoalException(String errorMessage){
        super(errorMessage);
    }
}
