package com.designPattern.creational.abstractFactory;

/**
 * Created by hongjingjun on 16/2/13.
 */

class Door implements IDoor {

}

class Wall implements IWall {

}

class Room implements IRoom {

    private int n;

    public Room(int n) {
        this.n = n;
    }

    public void setSide(EDirection dir, IWall wall) {

    }

    public void setSide(EDirection dir, IDoor door) {

    }
}

class Maze implements IMaze {

	public void addRoom(IRoom room) {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class MazeFactory implements IMazeFactory {

	public IMaze makeMaze() {
		// TODO Auto-generated method stub
		return null;
	}

	public IWall makeWall() {
		// TODO Auto-generated method stub
		return null;
	}

	public IRoom makeRoom(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public IDoor makeDoor(IRoom room1, IRoom room2) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class BombedMazeFactory implements IMazeFactory {

	public IMaze makeMaze() {
		// TODO Auto-generated method stub
		return null;
	}

	public IWall makeWall() {
		// TODO Auto-generated method stub
		return null;
	}

	public IRoom makeRoom(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	public IDoor makeDoor(IRoom room1, IRoom room2) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class MainClass {

    public static void main(String[] argv) {

//        IMaze amaze = MazeGame.createMaze(new MazeFactory());
//        amaze.run();

        IMaze amaze = MazeGame.createMaze(new BombedMazeFactory());
        amaze.run();;
    }
}
