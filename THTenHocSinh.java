public class THTenHocSinh {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    THTenHocSinh(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String args[]) {

        THTenHocSinh.change();
        THTenHocSinh s1 = new THTenHocSinh(111, "Hoang");
        THTenHocSinh s2 = new THTenHocSinh(222, "Khanh");
        THTenHocSinh s3 = new THTenHocSinh(333, "Nam");
             s1.display();
             s2.display();
             s3.display();
        }

    }

