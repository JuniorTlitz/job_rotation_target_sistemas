package question04;

import java.util.HashMap;
import java.util.Map;

public class FaturamentoRegional {
    public static void main(String[] args) {
        // Dados de faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Cálculo do valor total mensal da distribuidora
        double total = sp + rj + mg + es + outros;

        // Criação de um mapa para armazenar o percentual de representação de cada estado
        Map<String, Double> percentuais = new HashMap<>();
        percentuais.put("SP", (sp / total) * 100);
        percentuais.put("RJ", (rj / total) * 100);
        percentuais.put("MG", (mg / total) * 100);
        percentuais.put("ES", (es / total) * 100);
        percentuais.put("Outros", (outros / total) * 100);

        // Exibição dos percentuais de representação de cada estado
        System.out.println("Percentual de representação mensal por estado:");
        for (Map.Entry<String, Double> entry : percentuais.entrySet()) {
            System.out.println(entry.getKey() + " - R$" + String.format("%.2f", entry.getValue()) + "%");
        }
    }
}
