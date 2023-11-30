class Dog extends Animal {
    private boolean hasHome;

    public Dog(String name, int age, boolean hasHome) {
        super(name, age);
        this.hasHome = hasHome;
    }

    public boolean isHasHome() {
        return hasHome;
    }

    public void makeSound() {
        System.out.println("Гав");
    }
}