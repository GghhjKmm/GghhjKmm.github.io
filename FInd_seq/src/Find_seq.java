import java.util.Scanner;
public class Find_seq
{
    public static void main(String[] args) {
        //查找”蔡徐坤",“陈立农”，“肖战”，王源
        String []heizi={"cxk", "cln","xz","wy ","dql"};
        Scanner myScanner=new Scanner(System.in);
        do{
        System.out.println("输入你要查找的人名的英文字母缩写，如蔡徐坤：cxk");
        String names=myScanner.next();
        int index=-1;
        for(int i=0;i<heizi.length;i++){
            if(names.equals(heizi[i])){
                System.out.println("你要找的人是黑子，你要找的序号是"+(i+1));//break;
                index=i;
                         }
            }
        if(index==-1){
            System.out.println("没有找到");
        }
        System.out.println("继续查找请按任意键，输入0退出程序");
        char answer=myScanner.next().charAt(0);
        if(answer=='0')break;

    }while(true);
}}
