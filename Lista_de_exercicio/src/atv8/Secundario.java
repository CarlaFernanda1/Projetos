package atv8;

public class Secundario {
	public static String vendaecusto (float venda, float custo) {
		String x;
		
		if (venda > custo *1.5) {
			x = "lucro";
		} else {
			x = "preju�zo";
			
		} return x;
	}
}
