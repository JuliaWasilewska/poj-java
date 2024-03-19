package Lab11.Ex4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Flags extends JFrame {
    Flags() {
        JFrame frame = new JFrame("Enter time");

        List<Integer> flagNumbers = new ArrayList<>();
        List<String> flagRoots = new ArrayList<>();
        Random random = new Random();
        while (flagNumbers.size() < 3){
            int temp = random.nextInt(1,5);
            if(!flagNumbers.contains(temp)){
                flagNumbers.add(temp);
                flagRoots.add("Lab11/Ex4/Flaga" + temp + ".jpg");
            }
        }

        ImageIcon flag1 = new ImageIcon(flagRoots.get(0));
        JLabel flagLabel1 = new JLabel(flag1);
        flagLabel1.setBounds(0,5,200,100);
        frame.add(flagLabel1);

        ImageIcon flag2 = new ImageIcon(flagRoots.get(1));
        JLabel flagLabel2 = new JLabel(flag2);
        flagLabel2.setBounds(250,5,200,100);
        frame.add(flagLabel2);

        ImageIcon flag3 = new ImageIcon(flagRoots.get(2));
        JLabel flagLabel3 = new JLabel( flag3);
        flagLabel3.setBounds(500,5,200,100);
        frame.add(flagLabel3);

        frame.setSize(710, 150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}