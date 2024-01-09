import java.util.Scanner;
public class New_work_module_02 {

    public static void main(String[] args) {
        int [] arr={1,2,34,5,6};//缩减数组
        Scanner myScanner=new Scanner(System.in);
        do{
            int [] newarr=new int [arr.length-1];
            for(int i=0;i<newarr.length;i++){
                newarr[i]=arr[i];//新数组用旧数组赋值
            }
                arr=newarr;//用新数组代替旧数组
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println("是否要继续删除回复n退出，回复任意键继续删除");
            char answer=myScanner.next().charAt(0);
            if(arr.length==1||answer=='n'){
                System.out.println("只剩一个元素不能删减,程序结束");
                break;
            }
        }while(true);


    }
}
