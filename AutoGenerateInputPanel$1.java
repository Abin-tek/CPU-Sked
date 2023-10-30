/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class AutoGenerateInputPanel$1
implements Comparator<Process> {
    AutoGenerateInputPanel$1() {
    }

    @Override
    public int compare(Process p1, Process p2) {
        return p1.getArrivalTime() - p2.getArrivalTime();
    }
}
