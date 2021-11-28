package main.java.teht_13_visitor;

public interface HahmoVisitor {
	public int visit(PerusJarkko jarkko, int n);
	public int visit(TreenattuJarkko jarkko, int n);
	public int visit(MegaJarkko jarkko, int n);

}
