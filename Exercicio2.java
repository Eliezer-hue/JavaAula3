import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        int largura, altura, comprimento;

        comprimento = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor do comprimento em (cm)",
                "Solicita Dados", JOptionPane.WARNING_MESSAGE));

        largura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor da largura em (cm)",
                "Solicita Dados", JOptionPane.WARNING_MESSAGE));

        altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o valor da altura em (cm)",
                "Solicita Dados", JOptionPane.WARNING_MESSAGE));

        calculaVolumecaixa(comprimento, largura, altura);

    }

    // calcula o volume interno de uma caixa
    static void calculaVolumecaixa(int c, int l, int a) {
        int resultado;

        resultado = c * l * a;

        JOptionPane.showMessageDialog(null,
                "O volume interno da caixa é " + resultado + " cm³",
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
