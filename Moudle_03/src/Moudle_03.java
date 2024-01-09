import java.util.Scanner;
public class Moudle_03 {
    public static void main(String[] args) {
        //实现动态给数组添加元素
        int []arr={};

        Scanner myScanner=new Scanner(System.in);

        do{
            int []newarr=new int[arr.length+1];
            for(int i=0;i<arr.length;i++){
                newarr[i]=arr[i];//新数组中把旧数组的值复制进来
            }
            System.out.println("输入要添加的整数");
            int x=myScanner.nextInt();
            newarr[newarr.length-1]=x;
            arr=newarr;//用新数组替代之前的数组

            System.out.println("添加后数组的值是");
            for(int j=0;j< arr.length;j++){
                System.out.println(arr[j]);
            }
            System.out.println("是否要继续添加回复n退出，回复任意键继续添加");
            char answer=myScanner.next().charAt(0);
            if(answer=='n')
                break;
        }while(true);
        System.out.println("退出添加");
    }
}
