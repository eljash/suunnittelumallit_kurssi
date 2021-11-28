package main.java.teht_13_visitor;

public class BonusVisitor implements HahmoVisitor {

	@Override
	public int visit(PerusJarkko jarkko, int n) {
		return jarkko.maitoa(n);
	}

	@Override
	public int visit(TreenattuJarkko jarkko, int n) {
		return jarkko.steroideja(n);
	}

	@Override
	public int visit(MegaJarkko jarkko, int n) {
		return jarkko.lepaa(n);
	}

}
