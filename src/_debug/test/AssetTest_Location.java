package _debug.test;

import game.asset.core.Location;

public class AssetTest_Location {
	public static void main(String[] args) {
		Location l = new Location("World", "*DEBUG*", 10);
		l.print();
	}
}