package Ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sang Jun Park on 6/1/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class EventHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
public class InnerEx7 {
    public static void main(String[] args) {
        Button b1 = new Button("Start");
        b1.addActionListener(new EventHandler());

        //Anonymous
        Button b2 = new Button("Start");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
