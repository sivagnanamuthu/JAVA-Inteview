public class WrapperClassEx {
    
    public static void main(String[] args) {
        int i=10;
        // Single value container

        Integer iRef=new Integer(i);
        //Boxed (Constructing the object)

        int j=iRef.intValue();
        // Unboxing (Extracting the value from object)

        System.out.println("j "+j);

        Integer kRef=i;
        // Autoboxing (Integer kRef=new Interger(i))

        int l=kRef;
        // (Autounboxing)

        
    }
}
