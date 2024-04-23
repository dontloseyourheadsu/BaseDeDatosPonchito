import javax.swing.*;

public class MainPage extends JFrame {
    private JPanel mainPanel;

    public MainPage() {
        add(mainPanel);
        setTitle("Agencia de Viajes Ponchito");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MainPage mainPage = new MainPage();
        mainPage.setVisible(true);
    }
}
