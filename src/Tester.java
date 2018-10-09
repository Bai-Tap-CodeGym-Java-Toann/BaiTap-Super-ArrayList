public class Tester {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("toàn");
        list.add("không");
        list.add("đẹp");
        list.add("trai");

        print(list.getData());
        list.remove(1);

        print(list.getData());
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
    }
}
