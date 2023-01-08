import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        int i, j;

        i = 0;
        j = 0;

        // a função do ++ é acrecentar "1"
        i++;
        JOptionPane.showMessageDialog(null,
                "O valor de i é " + i,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

        // esta recebendo o valor atual de i
        j = i++;
        JOptionPane.showMessageDialog(null,
                "O valor de j é " + j,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "O valor de i é " + i,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                "Raiz quadrada de 9 é " + Math.sqrt(9),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}