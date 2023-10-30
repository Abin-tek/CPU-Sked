/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AutoGenerateInputPanel
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Exception performing whole class analysis ignored.
 */
private class AutoGenerateInputPanel.ActionHandler
implements ActionListener {
    private AutoGenerateInputPanel.ActionHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        block38: {
            if (event.getSource() != AutoGenerateInputPanel.access$0((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                AutoGenerateInputPanel.access$1((AutoGenerateInputPanel)AutoGenerateInputPanel.this, new ArrayList());
                AutoGenerateInputPanel.access$2((AutoGenerateInputPanel)AutoGenerateInputPanel.this);
                AutoGenerateInputPanel.access$3((AutoGenerateInputPanel)AutoGenerateInputPanel.this);
                AutoGenerateInputPanel.access$4((AutoGenerateInputPanel)AutoGenerateInputPanel.this);
            }
            if (event.getSource() == AutoGenerateInputPanel.access$5((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                int numberOfProcess = -1;
                try {
                    numberOfProcess = Integer.parseInt(AutoGenerateInputPanel.access$5((AutoGenerateInputPanel)AutoGenerateInputPanel.this).getText());
                    if (numberOfProcess < 0) {
                        if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 0) {
                            JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "Number of processes must be positive!", "Warning", 2);
                            break block38;
                        }
                        if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) != 1) break block38;
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "S\u1ed1 l\u01b0\u1ee3ng ti\u1ebfn tr\u00ecnh ph\u1ea3i l\u1edbn h\u01a1n 0!", "Th\u00f4ng b\u00e1o", 2);
                        break block38;
                    }
                    int count = 0;
                    while (count < numberOfProcess) {
                        String processID = "Job_" + (count + 1);
                        int arrivalTime = AutoGenerateInputPanel.access$7((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count];
                        int burstTime = 1 + AutoGenerateInputPanel.access$8().nextInt(20);
                        if (AutoGenerateInputPanel.access$9((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 4) {
                            AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).add(new Process("Job_" + (count + 1), AutoGenerateInputPanel.access$7((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count], 1 + AutoGenerateInputPanel.access$8().nextInt(20), count, AutoGenerateInputPanel.access$11((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count]));
                        } else {
                            Process process = new Process(processID, arrivalTime, burstTime, count);
                            AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).add(process);
                        }
                        ++count;
                    }
                }
                catch (NumberFormatException ex) {
                    if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 0) {
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "You must enter an integer!", "Warning", 2);
                        break block38;
                    }
                    if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) != 1) break block38;
                    JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "B\u1ea1n ph\u1ea3i nh\u1eadp v\u00e0o 1 s\u1ed1 d\u01b0\u01a1ng!", "Th\u00f4ng B\u00e1o", 2);
                }
            } else if (event.getSource() == AutoGenerateInputPanel.access$12((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                int numberOfProcess = 1 + AutoGenerateInputPanel.access$8().nextInt(10);
                int count = 0;
                while (count < numberOfProcess) {
                    if (AutoGenerateInputPanel.access$9((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 4) {
                        AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).add(new Process("Job_" + (count + 1), AutoGenerateInputPanel.access$7((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count], 1 + AutoGenerateInputPanel.access$8().nextInt(20), count, AutoGenerateInputPanel.access$11((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count]));
                    } else {
                        AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).add(new Process("Job_" + (count + 1), AutoGenerateInputPanel.access$7((AutoGenerateInputPanel)AutoGenerateInputPanel.this)[count], 1 + AutoGenerateInputPanel.access$8().nextInt(20), count));
                    }
                    ++count;
                }
            } else if (event.getSource() == AutoGenerateInputPanel.access$13((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                AutoGenerateInputPanel.this.setVisible(false);
                AutoGenerateInputPanel.this.setEnabled(false);
                Interface numberOfProcess = new Interface();
            } else if (event.getSource() == AutoGenerateInputPanel.access$14((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                int choice = 0;
                if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 0) {
                    choice = JOptionPane.showConfirmDialog((Component)AutoGenerateInputPanel.this, "Do you want to exit?", "Select an option", 1);
                } else if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 1) {
                    choice = JOptionPane.showConfirmDialog((Component)AutoGenerateInputPanel.this, "B\u1ea1n c\u00f3 mu\u1ed1n tho\u00e1t?", "T\u00f9y ch\u1ecdn", 1);
                }
                if (choice == 0) {
                    System.exit(0);
                }
            } else if (event.getSource() == AutoGenerateInputPanel.access$0((AutoGenerateInputPanel)AutoGenerateInputPanel.this)) {
                if (AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).size() == 0) {
                    if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 0) {
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "Please generate data first!", "Warning", 2);
                    } else if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 1) {
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "Vui l\u00f2ng kh\u1edfi t\u1ea1o d\u1eef li\u1ec7u tr\u01b0\u1edbc!", "Th\u00f4ng b\u00e1o", 2);
                    }
                } else if (AutoGenerateInputPanel.this.checkDataConstraints()) {
                    AutoGenerateInputPanel.this.setVisible(false);
                    AutoGenerateInputPanel.this.setEnabled(false);
                    MainProgramPanel choice = new MainProgramPanel(AutoGenerateInputPanel.access$9((AutoGenerateInputPanel)AutoGenerateInputPanel.this), AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this), AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this), 12);
                } else {
                    if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 0) {
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "Error with data constraints! \n We are sorry for this.\nPlease generate again. :)", "NOTICE", 1);
                    } else if (AutoGenerateInputPanel.access$6((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 1) {
                        JOptionPane.showMessageDialog((Component)AutoGenerateInputPanel.this, "!L\u1ed7i x\u1ea3y ra v\u1edbi r\u00e0ng bu\u1ed9c d\u1eef li\u1ec7u\n Ch\u00fang t\u00f4i r\u1ea5t ti\u1ebfc v\u00ec s\u1ef1 b\u1ea5t ti\u1ec7n n\u00e0y.\nVui l\u00f2ng kh\u1edfi t\u1ea1o l\u1ea1i l\u1ea7n n\u1eefa. :)", "Ch\u00fa \u00fd", 1);
                    }
                    AutoGenerateInputPanel.access$1((AutoGenerateInputPanel)AutoGenerateInputPanel.this, new ArrayList());
                    int count = 0;
                    while (count < 10) {
                        AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt("", count, 0);
                        AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt("", count, 1);
                        AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt("", count, 2);
                        AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt("", count, 3);
                        ++count;
                    }
                }
            }
        }
        int count = 0;
        while (count < AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).size()) {
            AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt(((Process)AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).get(count)).getProcessID(), count, 0);
            AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt(((Process)AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).get(count)).getArrivalTime(), count, 1);
            AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt(((Process)AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).get(count)).getBurstTime(), count, 2);
            if (AutoGenerateInputPanel.access$9((AutoGenerateInputPanel)AutoGenerateInputPanel.this) == 4) {
                AutoGenerateInputPanel.access$15((AutoGenerateInputPanel)AutoGenerateInputPanel.this).setValueAt(((Process)AutoGenerateInputPanel.access$10((AutoGenerateInputPanel)AutoGenerateInputPanel.this).get(count)).getPriority(), count, 3);
            }
            ++count;
        }
    }
}
