package question03;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            // Ler o arquivo JSON
            FileReader reader = new FileReader("src/main/resources/JSON/dados.json");

            // Converter o JSON para um array de objetos Java
            FaturamentoDia[] faturamentoDiario = gson.fromJson(reader, FaturamentoDia[].class);

            // Calcular o menor valor de faturamento
            double menorFaturamento = Double.MAX_VALUE;
            // Calcular o maior valor de faturamento
            double maiorFaturamento = Double.MIN_VALUE;
            // Calcular a soma do faturamento diário
            double somaFaturamento = 0;
            // Contar o número de dias com faturamento superior à média
            int numDiasSuperiorMedia = 0;
            // Contador de dias com faturamento
            int numDiasFaturamento = 0;

            for (FaturamentoDia faturamento : faturamentoDiario) {
                double valor = faturamento.getValor();
                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    numDiasFaturamento++;
                }
            }

            // Calcular a média do faturamento mensal, apenas se houver dias com faturamento
            double mediaMensal = 0;
            if (numDiasFaturamento > 0) {
                mediaMensal = somaFaturamento / numDiasFaturamento;
            }

            // Contar o número de dias com faturamento superior à média
            for (FaturamentoDia faturamento : faturamentoDiario) {
                if (faturamento.getValor() > mediaMensal) {
                    numDiasSuperiorMedia++;
                }
            }

            // Exibir os resultados
            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média: " + numDiasSuperiorMedia);

            // Fechar o leitor de arquivo
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
