package com.boya.test2;

public class Main {
    public static void main(String[] args) {
        System.out.println("git的初次修改尝试");
        RoverCoordinator roverCoordinator = new RoverCoordinator();
        roverCoordinator.setMaxX(5);
        roverCoordinator.setMaxY(5);

        Rover rover1 = new Rover(1,1,2,"N");
        roverCoordinator.addRover(rover1);

        Rover rover2 = new Rover(2,3,3,"E");
        roverCoordinator.addRover(rover2);



        roverCoordinator.action(rover1.getId(),"LMLMLMLMM");
        roverCoordinator.action(rover2.getId(),"MMRMMRMRRM");

        System.out.println(rover1);
        System.out.println(rover2);

        Rover rover3 = new Rover(2,9,15,"E");
        roverCoordinator.addRover(rover3);
    }
}
