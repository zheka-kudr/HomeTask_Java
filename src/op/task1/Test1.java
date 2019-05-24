package op.task1;

public class Test1 {
    private int variable1;
    private int variable2;

    Test1(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public int setVariable1(int variable1) {
        return this.variable1 = variable1;
    }

    public int setVariable2(int variable2) {
        return this.variable2 = variable2;
    }

    int getVariable1() {
        return variable1;
    }

    int getVariable2() {
        return variable2;
    }

    public int getSum() {
        return variable1 + variable2;
    }

    int getGreater() {
        if (variable1 > variable2) {
            return variable1;
        } else return variable2;
    }
}
