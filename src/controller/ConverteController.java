package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class ConverteController {
	
	public ConverteController() {
		super();
	}
	
	public String DecToBin(int valor) throws Exception {
		Pilha p = new Pilha();
		if(p.isEmpty()) {
			while(valor > 0) {
				int res = valor%2;
				valor = valor/2;
				p.push(res);
			}
		}
		while(!p.isEmpty()) {
			System.out.print(p.top()+" ");
			p.pop();
		}
		return null;
	}
}
