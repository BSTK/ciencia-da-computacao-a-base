package dev.bstk.sistemacodificacao.ui;

import dev.bstk.sistemacodificacao.conversor.ConversorBinario;
import dev.bstk.sistemacodificacao.conversor.ConversorHexa;
import dev.bstk.sistemacodificacao.conversor.ConversorOctal;
import dev.bstk.sistemacodificacao.conversor.SistemaNumeracao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class ConversorController {

  private final Conversor frame;

  public ConversorController(final Conversor frame) {
    this.frame = frame;
    this.frame.getBotaoConverter().addActionListener(e -> converter());
    this.frame.getBotaoConverter().addMouseListener(botaoConverterConfiguraCursor());

    this.frame.getComboboxDe().addActionListener(e -> validarComboboxComMesmoValor());
    this.frame.getComboboxPara().addActionListener(e -> validarComboboxComMesmoValor());
  }

  private void converter() {
    try {
      if (comboxNaoSelecionado()) {
        JOptionPane.showMessageDialog(frame, "Selecione De/Para!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        frame.getComboboxDe().setRequestFocusEnabled(true);
        return;
      }

      final var sistemaNumeracaoPara = SistemaNumeracao.of(Objects.requireNonNull(frame.getComboboxPara().getSelectedItem()).toString());
      final var textoEntrada = frame.getTextareaEntrada().getText();

      switch (sistemaNumeracaoPara) {
        case BINARIO:
          setarTextoConvertido(ConversorBinario.converteTextoParaBinarioCaractereDestacado(textoEntrada));
          break;

        case HEXA:
          setarTextoConvertido(ConversorHexa.converteTextoParaHexa(textoEntrada));
          break;

        case OCTAL:
          setarTextoConvertido(ConversorOctal.converteTextoParaOctal(textoEntrada));
          break;

        default:
          JOptionPane.showMessageDialog(frame, "Conversão não implementada!", "Erro!", JOptionPane.ERROR_MESSAGE);
      }
    } catch (IllegalArgumentException ex) {
      resetarCombobox();
    }
  }

  private void validarComboboxComMesmoValor() {
    final var comboboxDeItemSelecionado = String.valueOf(frame.getComboboxDe().getSelectedItem());
    final var comboboxParaItemSelecionado = String.valueOf(frame.getComboboxPara().getSelectedItem());

    if (comboboxDeItemSelecionado.equals(comboboxParaItemSelecionado)) {
      JOptionPane.showMessageDialog(frame, "De/Para não podem ser iguais!", "Aviso!", JOptionPane.WARNING_MESSAGE);
      resetarComboboxPara();
    }
  }

  private MouseAdapter botaoConverterConfiguraCursor() {
    return new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        frame.getBotaoConverter().setCursor(new Cursor(Cursor.HAND_CURSOR));
      }
    };
  }

  private void setarTextoConvertido(final String textoConvertido) {
    frame.getTextareaSaida().setText("");
    frame.getTextareaSaida().setText(textoConvertido);
  }

  private void resetarCombobox() {
    frame.getComboboxDe().setSelectedIndex(0);
    frame.getComboboxPara().setSelectedIndex(0);
    frame.getComboboxDe().setRequestFocusEnabled(true);
  }

  private void resetarComboboxPara() {
    frame.getComboboxPara().setSelectedIndex(0);
    frame.getComboboxPara().setRequestFocusEnabled(true);
  }

  private boolean comboxNaoSelecionado() {
    return frame.getComboboxDe().getSelectedIndex() == 0
      || frame.getComboboxPara().getSelectedIndex() == 0;
  }
}
