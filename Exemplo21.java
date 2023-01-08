import javax.swing.JOptionPane;

public class Exemplo21 {
    public static void main(String[] args) {
        float resposta, valor1, valor2;

        valor1 = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o primeiro valor",
                "Digite os dados", JOptionPane.WARNING_MESSAGE));

        valor2 = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite o segundo valor",
                "Digite os Dados", JOptionPane.WARNING_MESSAGE));

        // chamada do método(função)
        valor1 = solicitaNumero();
        valor2 = solicitaNumero();

        // chamada do método(função)
        resposta = soma(valor1, valor2);

        JOptionPane.showMessageDialog(null,
                resposta,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);

        // chamada do método(procedimento)
        exibeResultado("Eliezer");

    }

    // sub-rotinas(métodos)

    // Função (quando a retorno de valor)
    static float soma(float x, float y) {

        return x + y;
    }

    // Procedimento (quando não a retorno de valor)
    static void exibeResultado(String Nome) {
        JOptionPane.showMessageDialog(null,
                "Oláaaa " + Nome,
                "Teste procedimento", JOptionPane.INFORMATION_MESSAGE);
    }

    // Função (quando retorna valor)
    static float solicitaNumero() {
        return Float.parseFloat(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Entrada de Dados", JOptionPane.WARNING_MESSAGE));
    }
}
