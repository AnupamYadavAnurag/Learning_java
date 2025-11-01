class VoteCheck {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote!");
        else
            System.out.println("You can vote!");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
