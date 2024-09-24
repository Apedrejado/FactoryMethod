package factory;

public class GeradorDeRelatorio {

	public static void main(String[] args) {
		 String data = "Relatorio Gerado com sucesso";

	    
		 	RelatorioFactory pdfFactory = new PdfRelatorioFactory();
	        pdfFactory.generateReport(data);

	        RelatorioFactory csvFactory = new CsvRelatorioFactory();
	        csvFactory.generateReport(data);

	        RelatorioFactory excelFactory = new ExcelRelatorioFactory();
	        excelFactory.generateReport(data);

	}

}
