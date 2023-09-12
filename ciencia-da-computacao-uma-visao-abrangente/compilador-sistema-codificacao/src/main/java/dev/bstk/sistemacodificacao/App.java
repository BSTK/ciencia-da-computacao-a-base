package dev.bstk.sistemacodificacao;

import dev.bstk.sistemacodificacao.conversor.ConversorBinario;

public class App {

  public static void main(String[] args) {
    System.out.println("Texto: Sistema de codificação");
    System.out.println("Binario: " + ConversorBinario.converteTextoParaBinario("Sistema de codificação"));
  }

}
