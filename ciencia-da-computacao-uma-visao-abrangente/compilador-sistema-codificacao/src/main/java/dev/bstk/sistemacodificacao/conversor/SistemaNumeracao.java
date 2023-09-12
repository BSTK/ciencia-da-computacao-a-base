package dev.bstk.sistemacodificacao.conversor;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public enum SistemaNumeracao {

  TEXTO("Texto"),
  BINARIO("Binário"),
  DECIMAL("Decimal"),
  HEXA("Hexa"),
  OCTAL("Octal");

  private final String descricao;

  SistemaNumeracao(final String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public static SistemaNumeracao of(final String descricao) {
    if (StringUtils.isEmpty(descricao)) {
      throw new IllegalArgumentException(String.format("Descrição [ %s ] inválida!", descricao));
    }

    return Arrays.stream(values())
      .filter(item -> item.getDescricao().equals(descricao))
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException(String.format("Descrição [ %s ] inválida!", descricao)));
  }
}
