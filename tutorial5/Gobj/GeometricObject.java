package tutorial5.Gobj;
import java.util.*;
public class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private Date dateCreated = new Date();

    public GeometricObject(){

    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setfilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public String toString(){
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: "+ this.filled;
    }
}
