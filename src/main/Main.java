package main;

import java.util.Random;

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
        Random random = new Random();
        int inputRow = 0;
        int inputCol = 0;
        int unitRandomizer = 0;
        UnitType inputUnit;
        Player currentPlayer;
        int unitCount = 0;
        Boolean endOfTurn = false;

        // Start with Player Red
        gameEngine.setCurrentPlayer(playerRed);

        while (endOfTurn != true) {
            currentPlayer = gameEngine.getCurrentPlayer();
            System.out.println(currentPlayer.getName() + "'s turn to place units.");
            // User input simulation
            inputRow = random.nextInt(0,    3);
            inputCol = random.nextInt(0, 5);
            unitRandomizer = random.nextInt(0, 2);
            inputUnit = unitRandomizer == 0 ? UnitType.JAVA : UnitType.CPLUSPLUS;
            try {
                currentPlayer.placeUnit(inputRow, inputCol, inputUnit.createUnit());
            } catch (Exception e) {
                System.out.println("Invalid placement. Try again.");
                continue;
            }
            unitCount++;
            gameEngine.switchCurrentPlayer();
            if (unitCount >= 5) {
                endOfTurn = true; // End after one turn, test
            }
            System.out.println("-----------------------------------------------------------");
        }
    }
}