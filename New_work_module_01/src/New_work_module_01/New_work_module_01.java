package New_work_module_01;

public class New_work_module_01 {
    //逆序输出数组
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7};
        int []arr2=new int[arr1.length];

        for(int i=arr1.length-1, j=0;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}

