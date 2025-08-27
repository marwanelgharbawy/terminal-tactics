package main;

import game.*;
import units.*;

public class Main {
    public static void main(String[] args) {
        // Game setup initialization
        GameEngine gameEngine = new GameEngine();

        Player playerRed = new Player("Red", gameEngine);
        Player playerBlue = new Player("Blue", gameEngine);

        gameEngine.setPlayers(playerRed, playerBlue);

        Unit javaUnit = new Java();
        Unit cppUnit = new CPlusPlus();

        // Setup Phase
        int inputRow = 0;
        int inputCol = 0;
        UnitType inputUnit;
        Player currentPlayer = playerRed;
        while (true) {
            System.out.println("Player Red's turn.");
            // User input simulation
            inputRow = 0;
            inputCol = 0;
            inputUnit = UnitType.JAVA;
            switch (inputUnit) {
                case UnitType.JAVA:
                    currentPlayer.placeUnit(inputRow, inputCol, new Java());
                    break;
                case UnitType.CPLUSPLUS:
                    currentPlayer.placeUnit(inputRow, inputCol, new CPlusPlus());
                    break;
                default:
                    System.out.println("Invalid unit type.");
                    continue;
            }
        }
    }
}