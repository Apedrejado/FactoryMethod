package factory;

public class CSV implements IRelatorio{

	@Override
	public void GerarRelatorio(String data) {
	     System.out.println("Gerado com Csv : " + data);		
	}
}
