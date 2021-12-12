package main.java.teht_22_command;

public class Main {

	public static void main(String[] args) {
		Screen kangas = new Screen();
		WallButton nappi_kangas_alas = new WallButton(new RollDownCommand(kangas));
		WallButton nappi_kangas_ylos = new WallButton(new RollUpCommand(kangas));
		
		System.out.println("--Valkokangas ja napit asennettiin niin, että valkokangas on aluksi alhaalla");
		
		System.out.println("----Painetaan ylös nappia:");
		nappi_kangas_ylos.push();
		System.out.println("----Painetaan ylös nappia uudestaan:");
		nappi_kangas_ylos.push();
		
		System.out.println("----Painetaan alas nappia:");
		nappi_kangas_alas.push();
		System.out.println("----Painetaan alas nappia uudestaan:");
		nappi_kangas_alas.push();

	}

}
