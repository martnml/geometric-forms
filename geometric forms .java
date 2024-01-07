// @author ZERGAOUI MOHAMED EL AMINE
// @ version : 4.20
// @date : 13/04/2022
// since : Java 8



import java.util.Scanner;

public class Rectangle {

	
	//---------------paint Rectangle ------------
    static void Rectangle(){
        Scanner sc =new Scanner(System.in);
        int v = sc.nextInt();
        System.out.print("enter the width: ");
        int t = sc.nextInt();
        if (v < 1 || t < 1)
            System.out.print("please enter the height and the width correctly above the '0' :");
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= t; j++)
                System.out.print("*\t");
            System.out.print("\n");
        }

    }
    
    //  
    static void dent_de_s(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nRepeate times: ");
        int v = sc.nextInt();
        System.out.print("\nenter the width: ");
        int t = sc.nextInt();
        for (int d1 = 1; d1 <= v; d1++) {
            for (int i = 1; i <= t; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*\t");
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }

    static void Triangle(){
        Scanner sc =new Scanner(System.in);
        System.out.print("\nwidth: ");
        int v = sc.nextInt();
        for (int i = 1; i < v + 1; i++) {
            int j;
            for (j = i; j < v; ) {
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            for (j = 1; j < i + 1; ) {
                System.out.print("*");
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            System.out.print("\n");
        }}
    
    
    
    
    public static String Tringle_type(int v, int i, int j) {
        int a = 180 - i + j;
        int c = 180 - v + i;
        int b = 180 - v + j;
        String type = null;
        if (a == 90 || b == 90 || c == 90) {
            type = String.valueOf(a) + "" + b + "" + c + "" + "right";
            Draw(v, i, j, type);
        } else if (a > 90 || b > 90 || c > 90) {
            type = String.valueOf(a) + "" + b + "" + c + "" + "obtus";
            Draw(v, i, j, type);
        } else if (a < 90 && b < 90 && c < 90) {
            type = String.valueOf(a) + "" + b + ""+ c + "" + "Acute";
            Draw(v, i, j, type);
        }
        return type;
    }

    static void inversed_triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nwidth: ");
        int v = sc.nextInt();
        System.out.print("\n");
        int i;
        for (i = 1; i < v + 1; i++) {
            int j;
            for (j = 0; j < i; ) {
                System.out.print(" ");
                j++;
            }
            for (j = v; j >= i; ) {
                System.out.print("*");
                System.out.print(" ");
                j--;
            }
            System.out.print(" ");
            System.out.print("\n");
        }
        for (i = 2; i < v + 1; i++) {
            int j;
            for (j = i; j < v; ) {
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            for (j = 1; j < i + 1; ) {
                System.out.print("*");
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            System.out.print("\n");
        }
        System.out.print("\n");
        for (i = 1; i < v + 1; i++) {
            int j;
            for (j = i; j < v; ) {
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            for (j = 1; j < i + 1; ) {
                System.out.print("*");
                System.out.print(" ");
                j++;
            }
            System.out.print(" ");
            System.out.print("\n");
        }
        for (i = 1; i < v + 2; ) {
            System.out.print("*");
            System.out.print(" ");
            i++;
        }
        System.out.print("\n");
        for (i = 1; i < v + 1; i++) {
            int j;
            for (j = 0; j < i; ) {
                System.out.print(" ");
                j++;
            }
            for (j = v; j >= i; ) {
                System.out.print("*");
                System.out.print(" ");
                j--;
            }
            System.out.print(" ");
            System.out.print("\n");
        }

    }
    static void LetterZ(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nwidth: ");
        int v = sc.nextInt();
        System.out.print("\n");
        System.out.print(" ");
       int d = v;
        for (int k = 1; k < v + 1; ) {
            System.out.print("* ");
            k++;
        }
        System.out.print("\n");
        if (v > 8)
            v += v / 2;
        for (int i = 1; i < v + 1; i++) {
            for (int m = v + 2; m >= i; ) {
                System.out.print(" ");
                m--;
            }
            System.out.print("*");
            System.out.print("\n");
        }
        System.out.print(" ");
        v = d;
        for (int j = 1; j < v + 1; ) {
            System.out.print("* ");
            j++;
        }
        System.out.print("\n");

    }
    static void Triangle_type() {
        Scanner sc = new Scanner(System.in);

        int d = 1;
        while (d == 1) {
            System.out.print("\nEnter the specifications\na :");
            int v = sc.nextInt();
            System.out.print("b :");
            int i = sc.nextInt();
            System.out.print("c :");
            int j = sc.nextInt();
            if (v == 0 || i == 0 || j == 0) {
                System.out.print("\n  it's not a triangle  !!");
            } else if (v + i <= j || v + j <= i || i + j <= v) {
                System.out.println("-----> not a triangle");
            } else if (v == i && i == j) {
                System.out.println("----->  " + Tringle_type(v, i, j) + "/n");
            } else if ((v == i && v != j) || (j == i && j != v) || (v == j && v != i)) {
                System.out.println("------>  " + Tringle_type(v, i, j) + "/ isocele");
            } else if (v + i > j || v + j > i || i + j > v) {
                System.out.println("----->  " + Tringle_type(v, i, j) + "/ Scalar");
            } else {
                System.out.println("  it's not a triangle  !!\n");
            }
            System.out.print("\n Verify another traingle?  \n1-yes\n2-no : ");
            d = sc.nextInt();
        }
    }
    public static void Draw(int l , int m, int n, String t) {
        if (t.equals("right")) {
            for (int i = 0; i < l; i++) {
                for (int j = 1; j < i + 1; ) {
                    System.out.print("*");
                    System.out.print(" ");
                    j++;
                }
                System.out.print(" ");
                System.out.print("\n\n");
            }
        }
        else {
            for (int i = 0; i < l; i++) {
                int j;
                for (j = i; j < l; ) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print(" ");
                for (j = 1; j < i + 1; ) {
                    System.out.print("*");
                    System.out.print(" ");
                    j++;
                }
                System.out.print(" ");
                System.out.print("\n\n");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = 2;

        while (q == 2) {
            if (q == 1){System.out.println("----------------------Exit-----------------"); sc.close();}// quit the program


            System.out.print("\n-----------------    TP   ------------------------------------\n");
            System.out.print("1-Rectangle\n2-dent_de_S\n3-Triangle \n4-triangle inverse\n5-Letter Z\n6-Verify traingle:\n");
            int d = sc.nextInt();
            switch (d){
                case 1:Rectangle();break;
                case 2:dent_de_s();break;
                case 3:Triangle();break;
                case 4:inversed_triangle();break;
                case 5:LetterZ();break;
                case 6:Triangle_type();break;
                default:System.out.print("please choose correctly");break;

            }

            System.out.println("   do you wanna   ?\n1-Quit --> \n2-Continue :");
            q = sc.nextInt();
        }


    }
}
