package dev.bstk.sistemacodificacao.ui;


import javax.swing.*;
import java.awt.*;

public class Conversor extends javax.swing.JFrame {

  private final JButton botaoConverter = new JButton();

  private final JComboBox<String> comboboxDe = new JComboBox<>();
  private final JComboBox<String> comboboxPara = new JComboBox<>();

  private final JLabel labelPara = new JLabel();
  private final JLabel labelDe = new JLabel();

  private final JMenu jMenu1 = new JMenu();
  private final JMenu jMenu2 = new JMenu();

  private final JMenuBar jMenuBar1 = new JMenuBar();
  private final JMenuItem jMenuItem1 = new JCheckBoxMenuItem();

  private final JPanel panelSaida = new JPanel();
  private final JPanel panelEntrada = new JPanel();
  private final JPanel panelConversao = new JPanel();

  private final JTextArea textareaSaida = new JTextArea();
  private final JTextArea textareaEntrada = new JTextArea();

  private final JScrollPane jScrollPane1 = new JScrollPane();
  private final JScrollPane jScrollPane2 = new JScrollPane();

  public Conversor() {
    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    this.configuracaoComponentes();
    this.configuracaoLayoutComponentes();

    this.setVisible(Boolean.TRUE);
    this.pack();
  }

  private void configuracaoComponentes() {
    textareaEntrada.setRows(5);
    textareaEntrada.setColumns(20);
    textareaEntrada.setMargin(new Insets(5, 5, 5, 5));
    textareaEntrada.setFont(new Font("Segoe UI", 0, 18));
    jScrollPane2.setViewportView(textareaEntrada);

    final var panelEntradaLayout = new GroupLayout(panelEntrada);
    panelEntrada.setLayout(panelEntradaLayout);
    panelEntradaLayout.setHorizontalGroup(
      panelEntradaLayout.createParallelGroup(
          GroupLayout.Alignment.LEADING)
        .addGroup(
          panelEntradaLayout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2)
            .addContainerGap()));

    panelEntradaLayout.setVerticalGroup(
      panelEntradaLayout.createParallelGroup(
          GroupLayout.Alignment.LEADING)
        .addGroup(
          panelEntradaLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGap(12, 12, 12))
    );

    panelSaida.setPreferredSize(new Dimension(10, 245));
    textareaSaida.setRows(5);
    textareaSaida.setColumns(20);
    textareaSaida.setEnabled(false);
    textareaSaida.setMargin(new Insets(5, 5, 5, 5));
    textareaSaida.setFont(new Font("Segoe UI", 0, 18));
    jScrollPane1.setViewportView(textareaSaida);

    final var panelSaidaLayout = new GroupLayout(panelSaida);
    panelSaida.setLayout(panelSaidaLayout);
    panelSaidaLayout.setHorizontalGroup(
      panelSaidaLayout.createParallelGroup(
          GroupLayout.Alignment.LEADING)
        .addGroup(
          panelSaidaLayout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)
            .addContainerGap()));

    panelSaidaLayout.setVerticalGroup(
      panelSaidaLayout.createParallelGroup(
          GroupLayout.Alignment.LEADING)
        .addGroup(
          panelSaidaLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGap(12, 12, 12))
    );

    comboboxPara.setFont(new Font("Segoe UI", 0, 18));
    comboboxPara.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

    comboboxDe.setFont(new Font("Segoe UI", 0, 18));
    comboboxDe.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

    botaoConverter.setText("Converter");
    botaoConverter.setBackground(new Color(102, 204, 0));
    botaoConverter.setForeground(new Color(255, 255, 255));
    botaoConverter.setFont(new Font("Segoe UI", 0, 18));

    labelPara.setText("Para");
    labelPara.setFont(new java.awt.Font("Segoe UI", 0, 18));

    labelDe.setText("De");
    labelDe.setFont(new java.awt.Font("Segoe UI", 0, 18));

    jMenu1.setText("File");
    jMenuItem1.setText("jMenuItem1");
    jMenu1.add(jMenuItem1);
    jMenuBar1.add(jMenu1);
    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);
    setJMenuBar(jMenuBar1);
  }

  private void configuracaoLayoutComponentes() {
    panelSaida.setBorder(BorderFactory.createTitledBorder("Saída"));
    panelEntrada.setBorder(BorderFactory.createTitledBorder("Entrada"));

    final var panelConversaoLayout = new GroupLayout(panelConversao);
    panelConversao.setLayout(panelConversaoLayout);
    panelConversaoLayout.setHorizontalGroup(
      panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(panelConversaoLayout.createSequentialGroup()
          .addGap(3, 3, 3)
          .addComponent(labelDe, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
          .addGap(256, 256, 256)
          .addGroup(panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(labelPara, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
            .addGroup(panelConversaoLayout.createSequentialGroup()
              .addComponent(comboboxPara, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(botaoConverter, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addGroup(panelConversaoLayout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addComponent(comboboxDe, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
            .addContainerGap(489, Short.MAX_VALUE)))
    );

    panelConversaoLayout.setVerticalGroup(
      panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, panelConversaoLayout.createSequentialGroup()
          .addContainerGap(18, Short.MAX_VALUE)
          .addGroup(panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(labelPara)
            .addComponent(labelDe))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(comboboxPara)
            .addComponent(botaoConverter, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
          .addGap(22, 22, 22))
        .addGroup(panelConversaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addGroup(GroupLayout.Alignment.TRAILING, panelConversaoLayout.createSequentialGroup()
            .addContainerGap(41, Short.MAX_VALUE)
            .addComponent(comboboxDe, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
            .addGap(21, 21, 21)))
    );

    final var layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panelEntrada, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSaida, GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addComponent(panelConversao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addContainerGap())
    );

    layout.setVerticalGroup(
      layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addComponent(panelConversao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
          .addComponent(panelEntrada, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(panelSaida, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
          .addGap(15, 15, 15))
    );
  }
}
