package question05;


public class ReverteChar {

    public static void main(String[] args) {
        // String de entrada
        String entrada = "Hello, world!";
        // Converte a String em um array de caracteres
        char[] reverse = entrada.toCharArray();

        // Inverte os caracteres do array
        int i = 0;
        int j = reverse.length - 1;
        while(i < j){
            char temp = reverse[i];
            reverse[i] = reverse[j];
            reverse[j] = temp;
            i++;
            j--;
        }

        // Converte o array em uma String
        String resultado = new String(reverse);
        System.out.println("String invertida é: " + resultado);

    }

}
