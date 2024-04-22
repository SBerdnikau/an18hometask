package task1;

public enum Profession {

        DIRECTOR(0.65),
        WORKER(0.55),
        HR(0.25);

    private double coefficient;

    Profession(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
