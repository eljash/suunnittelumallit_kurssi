package main.java.teht_12;

public class RealImage implements Image {
	private final String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading "+filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Display "+filename);
		
	}

	@Override
	public String getData() {
		return filename;
		
	}

}
