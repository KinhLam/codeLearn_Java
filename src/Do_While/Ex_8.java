/*Bạn hãy viết chương trình hiển thị ra màn hình các số có số 0 ở cuối từ 1 tới 1000 (màn hình sẽ hiển thị lên các số 10, 20, 30, ..., 990, 1000)*/

package do_while;

public class Ex_8 {
    public static void main(String[] args){
        int i = 1;
        do {
            if(i % 10 == 0){
                System.out.print(i + " ");
            }
            i++;
        }while (i <= 1000);
    }
}
