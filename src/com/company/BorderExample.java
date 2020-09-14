package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderExample extends JFrame {

    JPanel[] pnl = new JPanel[6];

    public BorderExample() {
        super("Подсчет очков");
        setLayout(new GridLayout(2, 3));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(80, 80, 80));
            add(pnl[i]);
        }

        var textarea1 = new JTextArea("0");
        textarea1.setSize(20,100);
        textarea1.setEditable(false);
        textarea1.setRows(1);
        textarea1.setColumns(18);

        var textarea2 = new JTextArea("0");
        textarea2.setSize(20,100);
        textarea2.setEditable(false);
        textarea2.setRows(1);
        textarea2.setColumns(18);

        var textarea = new JTextArea();
        textarea.setEditable(false);
        textarea.setRows(4);
        textarea.setColumns(20);

        var b1 = new JButton("Добавить очко 1-ой команде");
        b1.addActionListener(e -> {

            textarea1.setText(String.valueOf(Integer.parseInt(textarea1.getText())+1));

            int i = Integer.parseInt(textarea1.getText());
            int j = Integer.parseInt(textarea2.getText());
            if (i>j)
            {
                textarea.setText("Побеждает первая команда");
            }
            else if (i<j)
            {
                textarea.setText("Побеждает вторая команда");
            }
            else textarea.setText("Счет равный");

        });

        var b2 = new JButton("Добавить очко 2-ой команде");
        b2.addActionListener(e ->
        {
            textarea2.setText(String.valueOf(Integer.parseInt(textarea2.getText())+1));

            int i = Integer.parseInt(textarea1.getText());
            int j = Integer.parseInt(textarea2.getText());
            if (i>j)
            {
                textarea.setText("Побеждает первая команда");
            }
            else if (i<j)
            {
                textarea.setText("Побеждает вторая команда");
            }
            else textarea.setText("Счет равный");

        });



        pnl[1].add(textarea);

        pnl[0].setLayout(new FlowLayout());
        pnl[0].add(b1);
        pnl[0].add(textarea1);

        pnl[2].setLayout(new FlowLayout());
        pnl[2].add(b2);
        pnl[2].add(textarea2);

        int i = Integer.parseInt(textarea1.getText());
        int j = Integer.parseInt(textarea2.getText());
         if (i>j)
         {
             textarea.setText("Подеждает первая команда");
         }
         else if (i<j)
         {
             textarea.setText("Подеждает вторая команда");
         }
         else textarea.setText("Счет равный");


        /*
        pnl[8].setLayout(new BorderLayout());
        pnl[8].add(new JButton("one"), BorderLayout.WEST);
        pnl[8].add(new JButton("two"), BorderLayout.EAST);
        pnl[8].add(new JButton("three"), BorderLayout.SOUTH);
        pnl[8].add(new JButton("four"), BorderLayout.NORTH);
        pnl[8].add(new JButton("five"), BorderLayout.CENTER);

        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("two"));
        pnl[10].add(new JButton("three"));
        pnl[10].add(new JButton("four"));
        pnl[10].add(new JButton("fve"));
         */

        setSize(900, 300);
    }

}
