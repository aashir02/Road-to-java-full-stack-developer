class  ChildNonStatic extends ParentNonStatic{
    public static void main(String[] args) {
        ChildNonStatic c = new ChildNonStatic();
        c.demo();
    }
    void demo(){
        System.out.println(a);
        test();
    }

}