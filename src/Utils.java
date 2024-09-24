/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nox
 */
public class Utils {

    /**
     *
     * @param currentFrame
     */
    public static void abrirMainFrame(javax.swing.JFrame currentFrame) {
        // Cria uma nova instância da tela de cadastro
        MainFrame mainFrame = new MainFrame();

        // Define a localização da nova janela em relação ao centro da tela
        mainFrame.setLocationRelativeTo(currentFrame);

        // Torna a nova janela visível
        mainFrame.setVisible(true);

        // Encerra a janela de login
        currentFrame.dispose();
    }

}
