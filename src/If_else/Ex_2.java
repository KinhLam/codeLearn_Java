/*
* Viết chương trình nhập vào từ bàn phím số nguyên n và hiển thị ra màn hình các thông tin tương ứng giống như sau:

Nếu n là số nguyên dương thì hiển thị ra:

n is a positive number
Nếu n là số nguyên âm thì hiển thị ra:

n is a negative number
Nếu n = 0 thì hiển thị ra:

n is equal to 0*/

package If_else;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("n is a positive number");
        } else if (n < 0) {
            System.out.println("n is a negative number");
        }else{
            System.out.println("n is equal to 0");
        }
    }
}
