package sample;

import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static Button bRed;
    public static Button bGreen;
    public static Button bBlue;
    public static Button bYellow;

    static List<Integer> pattern = new ArrayList<>();

    public static void nextRound()
    {
        pattern.add((int)(Math.random() * 4) + 1);
        displayPattern();
    }

    public boolean redClick()
    {

    }
    public boolean greenClick()
    {
        
    }
    public boolean blueClick()
    {

    }
    public boolean yellowClick()
    {

    }

    public static void displayPattern()
    {
        for (int i : pattern)
        {
            if(i == 1)
            {
                bRed.setStyle("-fx-background-color: rgb(255,100,100)");
                bRed.setStyle("-fx-background-color: rgb(255,0,0)");
            }
            if(i == 2)
            {
                bGreen.setStyle("-fx-background-color: rgb(100,255,100)");
                bGreen.setStyle("-fx-background-color: rgb(0,255,0)");
            }
            if(i == 3)
            {
                bBlue.setStyle("-fx-background-color: rgb(100,100,255)");
                bBlue.setStyle("-fx-background-color: rgb(0,0,255)");
            }
            if(i == 4)
            {
                bYellow.setStyle("-fx-background-color: rgb(255,255,200)");
                bYellow.setStyle("-fx-background-color: rgb(255,255,0)");
            }
        }
    }
}
