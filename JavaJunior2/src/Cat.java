class Cat extends Animal {
    private boolean hasHome;

    public Cat(String name, int age, boolean hasHome) {
        super(name, age);
        this.hasHome = hasHome;
    }
    public boolean isHasHome() {
        return hasHome;
    }
    public void makeSound() {
        System.out.println("Myaa");
    }
}