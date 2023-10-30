import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class AutoGenerateInputPanel extends JFrame {
   private BackgroundAutoGenerateInputPanel backgroundPanel;
   private JPanel buttonPanel;
   private JButton startButton;
   private JButton exitButton;
   private JButton backButton;
   private JTextField inputTextField;
   private JButton generateButton;
   private JTable table;
   private JPanel tablePanel;
   private Object[][] data = new Object[10][4];
   private String[] columnNames = new String[]{"Process ID", "Arrival Time", "Burst Time", "Priority"};
   private String[] columnNamesInVietNamese = new String[]{"Ti\u1ebfn tr\u00ecnh", "T.g \u0111\u1ebfn", "T.g th\u1ef1c thi", "\u0110\u1ed9 \u01b0u ti\u00ean"};
   private static final Random random = new Random();
   private static final int MAXIMUM_BURST_TIME = 20;
   private int[] arrivalTimes = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   private int[] priorities = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   private List<Process> processes = new ArrayList();
   private int language = 0;
   private int algorithm = 0;
   private static final int PRIORITY = 4;

   public AutoGenerateInputPanel(int language, int algorithm) {
      try {
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
      } catch (Exception var5) {
         if (language == 0) {
            JOptionPane.showMessageDialog(this, "Error generating GUI", "ERROR", 0);
         } else {
            JOptionPane.showMessageDialog(this, "L\u1ed7i kh\u1edfi t\u1ea1o GUI", "L\u1ed6I", 0);
         }
      }

      this.setLayout((LayoutManager)null);
      this.language = language;
      this.algorithm = algorithm;
      this.inputTextField = new JTextField();
      this.inputTextField.setSize(100, 25);
      this.inputTextField.setLocation(260, 135);
      this.add(this.inputTextField);
      this.generateButton = new JButton();
      if (language == 0) {
         this.generateButton.setText("Generate");
      } else if (language == 1) {
         this.generateButton.setText("Kh\u1edfi t\u1ea1o");
      }

      this.generateButton.setSize(100, 25);
      this.generateButton.setLocation(260, 220);
      this.generateButton.setBorder(new TitledBorder(new LineBorder(Color.GRAY)));
      this.add(this.generateButton);
      this.tablePanel = new JPanel();
      this.tablePanel.setLayout(new BorderLayout());
      if (language == 0) {
         this.table = new JTable(this.data, this.columnNames);
      } else if (language == 1) {
         this.table = new JTable(this.data, this.columnNamesInVietNamese);
      }

      this.table.setEnabled(false);
      JScrollPane scrollPane = new JScrollPane(this.table);
      this.tablePanel.add(scrollPane, "Center");
      this.tablePanel.setSize(400, 200);
      this.tablePanel.setBackground(Color.GRAY);
      this.tablePanel.setLocation(110, 350);
      this.tablePanel.setBorder(new TitledBorder(new LineBorder(Color.GRAY)));
      this.add(this.tablePanel);
      this.buttonPanel = new JPanel();
      this.buttonPanel.setLayout(new GridLayout(1, 3, 0, 0));
      this.backButton = new JButton();
      if (language == 0) {
         this.backButton.setText("Back");
      } else if (language == 1) {
         this.backButton.setText("Quay l\u1ea1i");
      }

      this.exitButton = new JButton();
      if (language == 0) {
         this.exitButton.setText("Exit");
      } else if (language == 1) {
         this.exitButton.setText("Tho\u00e1t");
      }

      this.startButton = new JButton();
      if (language == 0) {
         this.startButton.setText("Start");
      } else if (language == 1) {
         this.startButton.setText("B\u1eaft \u0111\u1ea7u");
      }

      this.buttonPanel.add(this.backButton);
      this.buttonPanel.add(this.exitButton);
      this.buttonPanel.add(this.startButton);
      this.buttonPanel.setSize(300, 25);
      this.buttonPanel.setLocation(165, 295);
      this.add(this.buttonPanel);
      this.backgroundPanel = new BackgroundAutoGenerateInputPanel(language);
      this.backgroundPanel.setSize(642, 670);
      this.add(this.backgroundPanel);
      this.setDefaultCloseOperation(3);
      this.setVisible(true);
      this.setSize(642, 685);
      AutoGenerateInputPanel$ActionHandler actionHandler = new AutoGenerateInputPanel$ActionHandler(this, (AutoGenerateInputPanel$ActionHandler)null);
      this.inputTextField.addActionListener(actionHandler);
      this.generateButton.addActionListener(actionHandler);
      this.backButton.addActionListener(actionHandler);
      this.exitButton.addActionListener(actionHandler);
      this.startButton.addActionListener(actionHandler);
   }

   private void removeAllData() {
      for(int count = 0; count < 10; ++count) {
         this.table.setValueAt("", count, 0);
         this.table.setValueAt("", count, 1);
         this.table.setValueAt("", count, 2);
         this.table.setValueAt("", count, 3);
      }

   }

   private void shuffleArrivalTimes() {
      for(int count = 0; count < this.arrivalTimes.length; ++count) {
         int index = random.nextInt(this.arrivalTimes.length);
         int temp = this.arrivalTimes[count];
         this.arrivalTimes[count] = this.arrivalTimes[index];
         this.arrivalTimes[index] = temp;
      }

   }

   private void shufflePriorities() {
      for(int count = 0; count < this.priorities.length; ++count) {
         int index = random.nextInt(this.priorities.length);
         int temp = this.priorities[count];
         this.priorities[count] = this.priorities[index];
         this.priorities[index] = temp;
      }

   }

   protected boolean checkDataConstraints() {
      List<Process> list = new ArrayList();
      Iterator var3 = this.processes.iterator();

      while(var3.hasNext()) {
         Process p = (Process)var3.next();
         list.add(p);
      }

      Collections.sort(list, new AutoGenerateInputPanel$1(this));
      int at = ((Process)list.get(0)).getArrivalTime();
      int bound = at + ((Process)list.get(0)).getBurstTime();
      if (list.size() != 1) {
         for(int count = 0; count < list.size() - 1; ++count) {
            if (((Process)list.get(count + 1)).getArrivalTime() > bound) {
               return false;
            }

            bound += ((Process)list.get(count + 1)).getBurstTime();
         }
      }

      return true;
   }
}
