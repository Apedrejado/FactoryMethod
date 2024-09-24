package factory;

public class CsvRelatorioFactory extends RelatorioFactory{

		@Override
		public IRelatorio createReport() {
			 return new CSV();
		}

}


