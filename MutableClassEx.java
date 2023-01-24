public class MutableClassEx {
    private String s;

    MutableClassEx(String s) {
        this.s = s;
    }

    public String getName() {
        return s;
    }

    public void setName(String coursename) {
        this.s = coursename;
    }

    public static void main(String[] args) {
        MutableClassEx obj = new MutableClassEx("MahiKannan");
        System.out.println(obj.getName());
        // Here, we can update the name using the setName method.
        obj.setName("Java Training");
        System.out.println(obj.getName());
    }
}