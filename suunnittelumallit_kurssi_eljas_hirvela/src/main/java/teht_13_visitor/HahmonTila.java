package main.java.teht_13_visitor;

public interface HahmonTila {
	public void iske(int n);
	public void aterioi(int n);
	public void juo(int n);
	public void pilkkaa(int n);
	public void jano(int n);
	public void nalka(int n);
	public int accept(HahmoVisitor visitor, int n);
	public HahmonTila getNextState();
}
