import javax.swing.JOptionPane;

public class Desafio1 {
    public static void main(String[] args) {
        int valor1, valor2, valor3, media;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o primeiro valor",
                "Solicita Dado", JOptionPane.WARNING_MESSAGE));

        valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o segundo valor",
                "Solicita Dado", JOptionPane.WARNING_MESSAGE));

        valor3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o terceiro valor",
                "Solicita Dado", JOptionPane.WARNING_MESSAGE));

        media = (valor1 + valor2 + valor3) / 3;

        JOptionPane.showMessageDialog(null,
                "O valor da media dos números é " + media,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
