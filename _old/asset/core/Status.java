package asset.core;

import asset.util.Asset;

public class Status extends Asset {
	private boolean avail;

	public Status(String name, String desc) {
		super(name, desc);
	}

	public boolean isAvailable() {
		return avail;
	}
}