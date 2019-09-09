package CarroMotoPessoa;

public class CarroMain {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setEndereco("rua de la");
		pessoa.setNome("TetaKat");
		System.out.println(pessoa);
		
		Motor motor = new Motor();
		motor.setCilindros(2);
		motor.setCombustivel("alcool");
		motor.setMarca("sei la");
		System.out.println(motor);
		
		Carro carro = new Carro();
		carro.setAno(2019);
		carro.setCor("amarelo");
		carro.setFabricantes("ford");
		carro.setModelo("3xCpaca");
		carro.setMotor(motor);
		carro.setPessoa(pessoa);
		System.out.println(carro);
		
		
		
		
		
	}

}
