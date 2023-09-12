package dev.bstk.sistemacodificacao.conversor;

import java.util.Objects;

public class ConversorHexa {

  private ConversorHexa() { }

  public static String converteTextoParaHexa(final String texto) {
    if (Objects.isNull(texto)) {
      return "";
    }

    final StringBuilder builder = new StringBuilder();

    for (char letra : texto.toCharArray()) {
      final String letraEmBinario = Integer.toHexString(letra);

      builder
        .append(letraEmBinario)
        .append(" ");
    }

    return builder.toString();
  }
}
