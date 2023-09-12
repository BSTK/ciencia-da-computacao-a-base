package dev.bstk.sistemacodificacao.conversor;

import java.util.Objects;

public class ConversorBinario {

  private ConversorBinario() { }


  public static String converteTextoParaBinario(final String texto) {
    if (Objects.isNull(texto)) {
      return "";
    }

    final StringBuilder builder = new StringBuilder();

    for (char letra : texto.toCharArray()) {
      final String letraEmBinario = String
        .format("%8s", Integer.toBinaryString(letra))
        .replace(" ", "0");

      builder
        .append(letraEmBinario)
        .append(" ");
    }

    return builder.toString();
  }

}