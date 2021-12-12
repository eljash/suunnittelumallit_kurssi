package main.java.teht_21_facade;

public class ComputerFacade {
	private CPU cpu = new CPU();
	private Memory memory = new Memory();
	private HardDrive hardDrive = new HardDrive();
	private final long kBootAddress = 0;
	private final int kSectorSize = 4096;
	
	public void start() {
		cpu.freeze();
		memory.load(kBootAddress, hardDrive.read(kBootAddress, kSectorSize));
		cpu.jump(kBootAddress);
		cpu.execute();
	}

}
