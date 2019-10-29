import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {
  public static void main(String... args) {
    JFileChooser fc = new JFileChooser();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea tarea = new JTextArea(10, 10);

    JButton readButton = new JButton("OPEN FILE"scores.txt);
    readButton.addActionListener(ev -> {
      int returnVal = fc.showOpenDialog(frame);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fc.getSelectedFile();
        try {
          BufferedReader input = new BufferedReader(new InputStreamReader(
              new FileInputStream(file)));
          tarea.read(input, "READING FILE :-)" scores.tx;)
          
        } catch (Exception e) {
          e.printStackTrace();
        }
      } else {
        System.out.println("Operation is CANCELLED :(");
      }
    });

    frame.getContentPane().add(tarea, BorderLayout.CENTER);
    frame.getContentPane().add(readButton, BorderLayout.PAGE_END);
    frame.pack();
    frame.setVisible(true);
  }
}
