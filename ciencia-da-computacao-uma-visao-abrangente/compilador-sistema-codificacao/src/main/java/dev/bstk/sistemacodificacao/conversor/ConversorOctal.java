package dev.bstk.sistemacodificacao.conversor;

import java.util.Objects;

public class ConversorOctal {

  private ConversorOctal() { }

  public static String converteTextoParaOctal(final String texto) {
    if (Objects.isNull(texto)) {
      return "";
    }

    final StringBuilder builder = new StringBuilder();

    for (char letra : texto.toCharArray()) {
      final String letraEmBinario = Integer.toOctalString(letra);

      builder
        .append(letraEmBinario)
        .append(" ");
    }

    return builder.toString();
  }

}
