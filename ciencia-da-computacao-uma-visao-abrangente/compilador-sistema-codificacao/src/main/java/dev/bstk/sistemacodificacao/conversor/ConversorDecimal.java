package dev.bstk.sistemacodificacao.conversor;

import java.util.Objects;

public class ConversorDecimal {

  private ConversorDecimal() { }

  // TODO - IMPLEMENTAR
  public static String converteTextoParaDecimal(final String texto) {
    if (Objects.isNull(texto)) {
      return "";
    }

    final StringBuilder builder = new StringBuilder();

    return builder.toString();
  }

}
