package com.designPattern.creational.Builder;

/**
 * Created by hongjingjun on 16/2/13.
 */

class Door implements IDoor {

}

class Wall implements IWall {

}

class Room implements IRoom {

}


class RomainHouse implements IHouse {


}


class RomainHouseBuilder implements IHouseBuilder {

	public void buildWindow() {
		// TODO Auto-generated method stub
		
	}

	public void buildWall() {
		// TODO Auto-generated method stub
		
	}

	public void buildRoom() {
		// TODO Auto-generated method stub
		
	}

	public void buildDoor() {
		// TODO Auto-generated method stub
		
	}

	public void buildFLoor() {
		// TODO Auto-generated method stub
		
	}

	public void buildCelling() {
		// TODO Auto-generated method stub
		
	}

	public IHouse getHouse() {
		// TODO Auto-generated method stub
		return null;
	}
}


public class MainClass {

    public static void main(String[] argv) {

        IHouse house = HouseManager.createHouse(new RomainHouseBuilder());

        //使用不同的builder 创建不同的 house,创建流程不变
//        IHouse house = HouseManager.createHouse(new OtherHouseBuilder());
    }
}
