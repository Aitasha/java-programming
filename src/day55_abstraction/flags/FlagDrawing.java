package day55_abstraction.flags;

import day54_abstraction.Main;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
       RussianFlag russianFlag = new RussianFlag();
       russianFlag.draw();

       FrenchFlag frenchFlag = new FrenchFlag();
       frenchFlag.draw();

       UkrainianFlag ukrainianFlag = new UkrainianFlag();
       ukrainianFlag.draw();




    }
}
