/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Jatin
 */
public class View_calc implements ActionListener{
    JTextField t;
    JButton dec;
    JButton equal;
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton plus;
    JButton minus;
    JButton multiply;
    JButton divide;
    JButton clear;
    private JFrame th;  
    public boolean a=false;
    public boolean b=true;
    public String s1;
    
    public View_calc() {
      
        th = new JFrame("Basic Math calculator");
        
        t = new JTextField();
        t.setBounds(45,45,245,40);
        
        one = new JButton("1");
        one.setBounds(45,110,50,50);
        
        four = new JButton("4");
        four.setBounds(45,175,50,50);
        
        seven = new JButton("7");
        seven.setBounds(45,240,50,50);
        
        dec = new JButton(".");
        dec.setBounds(45,305,50,50);
        
        two = new JButton("2");
        two.setBounds(110,110,50,50);
        
        five = new JButton("5");
        five.setBounds(110,175,50,50);
        
        eight = new JButton("8");
        eight.setBounds(110,240,50,50);
        
        zero = new JButton("0");
        zero.setBounds(110,305,50,50);
        
        three = new JButton("3");
        three.setBounds(175,110,50,50);
        
        six = new JButton("6");
        six.setBounds(175,175,50,50);
        
        nine = new JButton("9");
        nine.setBounds(175,240,50,50);
        
        equal = new JButton("=");
        equal.setBounds(175,305,50,50);
        
        plus = new JButton("+");
        plus.setBounds(240,110,50,50);
        
        minus = new JButton("-");
        minus.setBounds(240,175,50,50);
        
        multiply = new JButton("*");
        multiply.setBounds(240,240,50,50);
        
        divide = new JButton("/");
        divide.setBounds(240,305,50,50);
        
        clear = new JButton("clear");
        clear.setBounds(110,370,100,50);
        
        th.setSize(350, 470);
        th.add(one);
        th.add(two);
        th.add(three);
        th.add(four);
        th.add(five);
        th.add(six);
        th.add(seven);
        th.add(eight);
        th.add(nine);
        th.add(dec);
        th.add(zero);
        th.add(equal);
        th.add(plus);
        th.add(multiply);
        th.add(divide);
        th.add(minus);
        th.add(t);
        th.add(clear);
       
        th.setLayout(null);
        th.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        th.setVisible(true);
        
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        minus.addActionListener(this);
        dec.addActionListener(this);
        clear.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==one){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("1"));
        }
           
        
        if(e.getSource()==two){
            {
            if(this.b==true){
              this.b=false;
              t.setText("");
            }t.setText(t.getText().concat("2"));
        }
            
        }
        if(e.getSource()==three){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==four){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==five){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==six){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==seven){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==eight){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==nine){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==zero){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==dec){
            if(this.b==true){
              this.b=false;
              t.setText("");
            }
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==plus)
            t.setText(t.getText().concat("+"));
        
        if(e.getSource()==multiply)
            t.setText(t.getText().concat("*"));
        
        if(e.getSource()==divide)
            t.setText(t.getText().concat("/"));
        
        if(e.getSource()==minus)
            t.setText(t.getText().concat("-"));
        
        if(e.getSource()==clear)
        {
            t.setText("");
            a=false;
        }
        if(e.getSource()==equal)
        {          
           this.s1=t.getText();
           if("".equals(s1))
            {
              JOptionPane.showMessageDialog(th, "Please enter  expression");   
            }
           else {
               this.a=true;
               this.b=true;
           }      
        }
    }

    public void view_jframe(String ans){
           t.setText(ans); 
        }
    
    public void view_cmdline(String exp, String ans){
           System.out.println(exp+" = "+ans);  
           
        }
}
