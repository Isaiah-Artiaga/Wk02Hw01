/**
 * Name: Isaiah Artiaga
 * Date: 09/05/2025
 * Takes in two ints x and y and finds their total through subtraction or addition, depending on the input.
 */
public class Learning {
    public static final int VERSION = 42;

    private int x;
    private int y;

    protected String operation;

    double output;

    public Learning(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    /**
     * Performs the set operation on the parameters x and y
     * @param x an integer
     * @param y an integer
     * @return output a double
     */

    public double operate(int x, int y) {
        switch (operation) {
            case "addition":
            case "add":
                output = x + y;
                System.out.printf("%d + %d == %f", x, y, output);
                break;
            case "subtraction":
                output = x-y;
                System.out.printf("%d - %d == %f", x, y, output);
                break;
            default:
                output = 0;
                System.out.printf("I don't know what %s is %n", operation);
        }
        return output;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }
}
