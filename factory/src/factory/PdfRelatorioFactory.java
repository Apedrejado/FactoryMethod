package factory;

public class PdfRelatorioFactory  extends RelatorioFactory{

	@Override
	public IRelatorio createReport() {
		 return new PDF();
	}

}
