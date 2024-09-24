package factory;

public abstract class RelatorioFactory {

    // Factory Method
    public abstract IRelatorio createReport();

    public void generateReport(String data) {
        IRelatorio relatorio = createReport(); 
        relatorio.GerarRelatorio(data);              
    }
}
