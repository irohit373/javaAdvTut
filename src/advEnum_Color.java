public enum advEnum_Color {
    RED("It is red"), GREEN("It is green"), BLUE("It is Blueeeee");
    private String value;

    advEnum_Color(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
