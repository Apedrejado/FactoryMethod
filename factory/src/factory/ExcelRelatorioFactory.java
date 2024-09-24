package factory;

public class ExcelRelatorioFactory extends RelatorioFactory{

	@Override
	public IRelatorio createReport() {
		 return new Excel();
	}

}
