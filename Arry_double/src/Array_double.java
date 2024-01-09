import java.util.Scanner;
public class Array_double{

    public static void main(String[] args) {
        //已知有个升序的数组，插入一个元素，仍升序{10，12，45，90}插入23后仍升序
        //方法一先扩容，定位插入位置local=2;
        //{10,12}j
        int[] arrseq = {10, 12, 45, 90};
        int[] newarr = new int[arrseq.length + 1];
        Scanner myScanner = new Scanner(System.in);
        int flag = -1;
        System.out.println("输入要插入的元素");
        int insert_elem = myScanner.nextInt();//接受要插入的元素
        for(int i=0;i<arrseq.length;i++){//定位
            if(arrseq[i]>=insert_elem){
                flag=i;
                System.out.println("插入位置是" + (flag+1));
                break;
            }
        }
        if (flag == -1) {//数据特别大时

            {   flag= arrseq.length;//定位的作用
                System.out.println("插入位置是" + (arrseq.length +1));}}
        for (int i = 0, j = 0; i <newarr.length; i++) {//扩容
            if (i != flag) {
                newarr[i] = arrseq[j];//把原来数组不等于要插入位置的copy
                j++;

            } else {
                newarr[j] = insert_elem;
            }
        }
        arrseq = newarr;
            for (int i = 0; i < arrseq.length; i++) {
                System.out.print(arrseq[i] + "\t");

            }

        }
    }