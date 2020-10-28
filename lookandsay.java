public class Teste {

    public static void main(String[] args) {
        teste(10);
    }

    public static void teste(int x){
        String valor = "1";
        for (int i = 0; i <= x; i++) {
            int count = 1;
            char[] numeros = valor.toCharArray();
            valor = "";
            for(int y = 0; y < numeros.length; y++) {
                if (numeros.length == y + 1) {
                    valor = valor.concat(String.valueOf(count) + numeros[y]);
                    count = 1;
                } else {
                    if (numeros[y] == numeros[y + 1]) {
                        count++;
                    }
                    else {
                        valor = valor.concat(String.valueOf(count) + numeros[y]);
                        count = 1;
                    }
                }
            }
            System.out.println(valor);
        }
    }
}
