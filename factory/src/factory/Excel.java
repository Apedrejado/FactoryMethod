package factory;

public class Excel implements IRelatorio {

	@Override
	public void GerarRelatorio(String data) {
	     System.out.println("Gerado com Excel : " + data);		
	}

}
