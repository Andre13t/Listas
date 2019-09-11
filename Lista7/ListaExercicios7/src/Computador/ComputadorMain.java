package Computador;

public class ComputadorMain {
	public static void main(String[] args) {
		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setConsumo(1000);
		ee.setTensao(220);
		System.out.println(ee);
		
		Hd hd = new Hd();
		hd.setCapacidade(200);
		hd.setMarca("SD");
		hd.setModelo("993g");
		hd.setRpm(7000);
		System.out.println(hd);
		
		Memoria memoria = new Memoria();
		memoria.setCapacidade(4);
		memoria.setMarca("corsair");
		memoria.setModelo("2d244");
		memoria.setVelocidade(1333);
		System.out.println(memoria);
		
		Processador processador = new Processador();
		processador.setCache(13);
		processador.setClock(3);
		processador.setMarca("seaçsd");
		processador.setModelo("sadgo2222");
		System.out.println(processador);
		
		PlacaMae placaMae = new PlacaMae();
		placaMae.setHd(hd);
		placaMae.setMarca("asus");
		placaMae.setMemoria(memoria);
		placaMae.setModelo("asd22");
		placaMae.setProcessador(processador);
		System.out.println(placaMae);
		
		Gabinete gabinete = new Gabinete();
		gabinete.setBaias(3);
		gabinete.setModelo("AxK300");
		gabinete.setPlacaMae(placaMae);
		gabinete.setTipo("atx");
		System.out.println(gabinete);
		
		Monitor monitor = new Monitor();
		monitor.setMarca("aoc");
		monitor.setResolucao("2314x2354");
		monitor.setTipo("led");
		System.out.println(monitor);
		
		Mouse mouse = new Mouse();
		mouse.setMarca("razer");
		mouse.setTipo("cabo");
		System.out.println(mouse);
		
		Teclado teclado = new Teclado();
		teclado.setMarca("logitech");
		teclado.setTipo("membrana");
		System.out.println(teclado);
		
		Computador c = new Computador();
		c.setConsumo(1000);
		c.setGabinete(gabinete);
		c.setMarca("dell");
		c.setModelo("sd2444");
		c.setMonitor(monitor);
		c.setMouse(mouse);
		c.setTeclado(teclado);
		c.setTensao(220);
		
	}	
}
