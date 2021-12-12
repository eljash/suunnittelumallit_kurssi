package main.java.teht_21_facade;

import java.util.ArrayList;
import java.util.List;

public class HardDrive {
	private List<String> data;
	private final String bootCode = "konekieli joka ladataan RAM-muistiin";
	
	public HardDrive() {
		data = new ArrayList<String>();
		data.add(bootCode);
		
		try {
			//Tämänkään ei pitäisi ikinä olla false
			if(!data.get(0).equals(bootCode))
				data.set(0, bootCode);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Tätä ei pitäisi tapahtua");
		}
	}
	
	public String read(long lba, int size){
		System.out.println("-HARDDRIVE: luetaan tieto paikasta: "+lba+"\n      '"+data.get((int)lba)+"'");
		return data.get((int)lba);
	}

}
