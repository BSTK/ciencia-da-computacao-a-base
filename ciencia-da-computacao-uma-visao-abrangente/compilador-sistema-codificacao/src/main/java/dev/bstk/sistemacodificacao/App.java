package dev.bstk.sistemacodificacao;

import dev.bstk.sistemacodificacao.ui.Conversor;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
          if ("Metal".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
          }
        }

        new Conversor();
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        LOGGER.log(Level.SEVERE, null, ex);
      }
    });
  }

}
