public class Sort_Bubble {
    public static void main(String[] args) {
        //将数组{2，5，60，37，58}从小到达进行冒泡排序

        int []arr={2,44,60,37,58};
        int temp=0;//交换的中间变量
       for(int i=0;i<arr.length-1;i++) {//次数
            for (int j = 0; j < arr.length-1-i; j++) {//一次排序//第一次比较4，第二次3次，第三次3次
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;}
                    }
                    System.out.print("\n"+"第" + (i+1)+ "次比较的结果"+"\n"); //输出x次交换后的数组
                    for (int j = 0; j < arr.length; j++)
                    {System.out.print(arr[j]+"\t");}

        }
    }
}
