import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args) {

        boolean teste;

        teste = ehMaior_que_5(8);

        JOptionPane.showMessageDialog(null,
                teste,
                "Teste Função", JOptionPane.INFORMATION_MESSAGE);

    }

    static boolean ehMaior_que_5(int x) {
        boolean resp = false;

        if (x > 5) {
            resp = true;
        }

        return resp;
    }

}
