import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int horas, minutos, resp;

        horas = solicitaNumero();
        minutos = solicitaNumero();

        resp = calculoHoraminutos(horas, minutos);

        JOptionPane.showMessageDialog(null,
                "Se passaram " + resp + " minutos desde o inicio do dia",
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    //solicita números inteiros de horas e minutos
    //Função(quando retornar valor)
    static int solicitaNumero() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número",
                "Solicita Dados", JOptionPane.WARNING_MESSAGE));
    }

    //Função(quando retornar valor) 
    static int calculoHoraminutos(int h, int m) {
        return (h * 60) + m;
    }

}
