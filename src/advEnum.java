public class advEnum {
    public static void main(String[] args) {
        
        advEnum_Color c1 = advEnum_Color.RED;
            System.out.println(c1.name());
            System.out.println(c1.getValue());
       for (advEnum_Color color : advEnum_Color.values()) {
            System.out.println(color.getValue());
        }
    }
}
