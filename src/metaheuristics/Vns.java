package metaheuristics;

import definition.Instance;
import definition.Neighborhood;
import definition.Solution;

public class Vns extends Solver{
	private int nbBoucles;
	
	public Vns(Instance inst,int n) {
		super(inst,"VNS");
		this.nbBoucles = n;
	}

	public void solve() {
		Neighborhood[] tab = new Neighborhood[3];
		tab[0] = Neighborhood.CHANGE;
		tab[1] = Neighborhood.SHIFT;
		tab[2] = Neighborhood.SWAP;
		
		Solver solver = new Neh(this.getInstance());
		solver.solve();
		LocalSearch ls = new LocalSearch(this.getInstance(),tab[0],solver.getSolution());
		Solution s = solver.getSolution();
		
		int k = 0; // ATTENTION : influe l'ordre d'application influe sur le resultat final !
		int n = 0;
		do{
			//*
			if(k==3)
				k=0;
			//*/
			//k = (int)(Math.random()*tab.length);
			
			ls.setNeighborhood(tab[k]);
			ls.solve();
			s = ls.getSolution();
			
			k++;
			n++;
		}while(n<this.nbBoucles);
		
		this.setSolution(s.clone());
	}

}