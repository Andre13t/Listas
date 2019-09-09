package homeTheater;

public class EquipamentoMain {
	public static void main(String[] args) {

		EquipamentoEletronico equipaentoEletronico = new EquipamentoEletronico();
		equipaentoEletronico.setTencao(220);
		equipaentoEletronico.setConsumo(1500);
		System.out.println(equipaentoEletronico);

		SistemaDeSom sistemaDeSom = new SistemaDeSom();
		sistemaDeSom.setTencao(220);
		sistemaDeSom.setPotencia(120);
		sistemaDeSom.setModelo("sony pinto");
		sistemaDeSom.setMarca("SONY");
		sistemaDeSom.setConsumo(1500);
		System.out.println(sistemaDeSom);

		SistemaDeVideo sistemaDeVideo = new SistemaDeVideo();
		sistemaDeVideo.setConsumo(1500);
		sistemaDeVideo.setMarca("xiamo");
		sistemaDeVideo.setModelo("p293");
		sistemaDeVideo.setResolucao("800x600");
		sistemaDeVideo.setTencao(220);
		sistemaDeVideo.setTipo("sei la");
		System.out.println(sistemaDeVideo);

		HomeTheater homeThearter = new HomeTheater();
		// homeThearter.som.setTencao(1200);
		// homeThearter.video.setResolucao("1280x1980");

		homeThearter.setSom(sistemaDeSom);
		homeThearter.setVideo(sistemaDeVideo);

	}

}
