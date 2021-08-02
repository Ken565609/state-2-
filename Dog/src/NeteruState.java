class NeteruState extends DogState {
    private static NeteruState s = new NeteruState();
    private  NeteruState() {}
    public static DogState getInstance() {
        return s;
    }
    public void tukareta(Dog moto) {
        moto.changeState(IrairaState.getInstance());
    }
    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }
    public String toString() {
        return "スヤスヤ状態";
    }
}