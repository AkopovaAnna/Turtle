package Game;

import Game.Exception.IncorrectCommandException;
import java.util.Scanner;

import Game.Exception.OutOfBoundException;

public class Main {

    private static void instructions() {
        System.out.println("Please Select From One Of The Following Commands:\n");  // Commands To Choose From
        System.out.println("1: Pen Up");
        System.out.println("2: Pen Down");
        System.out.println("3: Direction");
        System.out.println("4: Move Forward");
        System.out.println("5: Display the result board");
        System.out.println("6: Clear the board: Return turtle to start location");
        System.out.println("7: Exit\n");
    }

    private static void directionInst(){
        System.out.println("Please Specify Your Desired Direction\n");
        System.out.println("1: Turn Up ");
        System.out.println("2: Turn Right");
        System.out.println("3: Turn Down");
        System.out.println("4: Turn Left\n");
    }

    public static void main(String[] args)  {
        Handler handler = new Handler();
        Scanner input = new Scanner(System.in);
        instructions();
        while (true) {
            System.out.println("Enter command");

            try{
                int command = input.nextInt();
                if (command == 3) {
                    directionInst();
                    int scanner = input.nextInt();
                    handler.enterCommands(command, scanner);
                } else if (command == 4) {
                    System.out.println("Moving Forward...Please Enter Desired Value\n");
                    int scanner = input.nextInt();
                    handler.enterCommands(command, scanner);
                } else if(command == 7){
                    handler.enterCommands(command, 0);
                    break;
                } else if(command>7){
                    throw new IncorrectCommandException("Wrong input command");
                } else {
                    handler.enterCommands(command, 0);
                }
            } catch (OutOfBoundException e){
                System.out.println(e.getMessage());
            } catch(IncorrectCommandException i){
                System.out.println(i.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
