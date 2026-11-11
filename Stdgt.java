class Student {
    private int id;

    void getter() {
        System.out.println(id);
    }

    void setter(int num) {
        id = num;
    }
    
}
 class Stdgt{
    public static void main(String[] args) {
        Student st = new Student();
        st.setter(202167);
        st.getter();
    }

 }