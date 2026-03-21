public enum Logger {
    INSTANCE;

    public void log(String msg){
        System.out.println("[Log]: " + msg);
    }
}
