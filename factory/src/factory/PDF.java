package factory;

public class PDF  implements IRelatorio {

	@Override
	public void GerarRelatorio(String data) {
	     System.out.println("Gerado com PDV : " + data);		
	}

}
