public class AutoboxingUnboxingSample {
    public static void main(String[] args) {
        int i = 10;
        char c = 'a';
        System.out.println(i);
        System.out.println(c);

        //  Autobox
        Integer iobj = Integer.valueOf(i);
        Character cobj = Character.valueOf(c);
        System.out.println(iobj);
        System.out.println(cobj);

        // auto-unbox
        int i1 = iobj;
        char ci = cobj;
        System.out.println(i1);
        System.out.println(ci);
        
    }
}
