


public class TestaFuncionario {

	public static void main(String[] args) {
		
		
		Gerente g1 = new Gerente();

		g1.setId(111);
		g1.setSalary(5000);
		g1.setName("Hygor");
		g1.setMeta(2000);
		
		
		System.out.println("Matricula: "+g1.getId());
		System.out.println("Nome: "+g1.getName());
		System.out.println("Salário Bruto: " +g1.getSalary());
		if(g1.getMeta()>= 1000){
			g1.setSalary(g1.getSalary()+1000);
			System.out.println("Bateu a meta");
		}
		System.out.println("Salário + Comissão: "+g1.getSalary());
		
		System.out.println("---------------------------------------------------");
		
		
		Vendedor v1 = new Vendedor();
		v1.setId(222);
		v1.setName("João");
		v1.setSalary(2000);
		v1.setComissao(v1.getSalary()*0.15);
		
		
		System.out.println("Matricula: "+v1.getId());
		System.out.println("Nome: "+v1.getName());
		System.out.println("Salário Bruto: " +v1.getSalary());
		System.out.println("Comissão: "+v1.getComissao());
		System.out.println("Total de proventos: "+ (v1.getSalary()+v1.getComissao()));
		
	}

}
