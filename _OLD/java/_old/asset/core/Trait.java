package asset.core;

import asset.util.Asset;

public class Trait extends Asset {
	private boolean avail;

	public Trait(String name, String desc) {
		super(name, desc);
	}

	public boolean isAvailable() {
		return avail;
	}
}