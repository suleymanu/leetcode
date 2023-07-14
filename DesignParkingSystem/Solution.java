class ParkingSystem {
    private int[] space = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        space[1]=big;
        space[2]=medium;
        space[3]=small;
    }
    
    public boolean addCar(int carType) {
        if(space[carType]==0) return false;
        --space[carType]; return true;
    }
}
