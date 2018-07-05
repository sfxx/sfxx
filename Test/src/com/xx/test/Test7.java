package com.xx.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Test7 implements ActionListener,ChangeListener {
JFrame frame=null;
JProgressBar progressbar;
JLabel label;
Timer timer;
JButton b;
public Test7(){
   frame=new JFrame("安装");
   frame.setBounds(100, 100, 400, 130);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container contentPanel=frame.getContentPane();
   label=new JLabel("",JLabel.CENTER);
   progressbar = new JProgressBar();
   progressbar.setOrientation(JProgressBar.HORIZONTAL);
   progressbar.setMinimum(0);
   progressbar.setMaximum(100);
   progressbar.setValue(0);
   progressbar.setStringPainted(true);
   progressbar.addChangeListener(this);
   progressbar.setPreferredSize(new Dimension(300,20));
   progressbar.setBorderPainted(true);
   progressbar.setBackground(Color.pink);
  
   JPanel panel=new JPanel();
   b=new JButton("安装");
   b.setForeground(Color.blue);
   b.addActionListener(this);
   panel.add(b);
   timer=new Timer(100,this);
   contentPanel.add(panel,BorderLayout.NORTH);
   contentPanel.add(progressbar,BorderLayout.CENTER);
   contentPanel.add(label,BorderLayout.SOUTH);
   //frame.pack();
   frame.setVisible(true);
  
  
}

public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b){
    timer.start();
   }
     if(e.getSource()==timer){
     int value=progressbar.getValue();
     if(value<100)
        progressbar.setValue(++value);
     else{
        timer.stop();
        frame.dispose();
     }
     }
  
}

public void stateChanged(ChangeEvent e1) {
   int value=progressbar.getValue();
   if(e1.getSource()==progressbar){
    label.setText("目前已完成进度："+Integer.toString(value)+"%");
    label.setForeground(Color.blue);
   }
  
}
public static void main(String[] args) {
	Test7 app=new Test7();
}

}