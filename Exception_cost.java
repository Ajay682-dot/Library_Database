package bxkJWABXK.Project;

public class Exception_cost extends RuntimeException{
    public String toString(){
        return getClass()+"cost should be in range between 300 to 3000";
    }
}
