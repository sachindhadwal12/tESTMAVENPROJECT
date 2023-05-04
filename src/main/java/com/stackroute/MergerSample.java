package com.stackroute;

public class MergerSample {


    public int[] arraynum;
    public int[] result=new int[6];

    MergerSample(int[] ar1)
    {
        arraynum=ar1;
        // result=arraynum;
        //for()
        for(int i=0;i<ar1.length;i++)
            result[i]=arraynum[i];
    }

    int[] mergeRecord(int[] array2)
    {
        int len=arraynum.length;
        //	 int size=result.length;
        // System.out.println("result " + size);
//		 List list1=Arrays.asList(arraynum);
//
//				list1.add(merge.arraynum) ;

        int len2=array2.length;


        for (int j=0;j<len2;j++)
        {
            result[len]=array2[j];
            len++;
        }
        return result;


    }

    public static void main(String args[])
    {
        int[] ar=new int[] {1,2,3};
        int[] ar2=new int[] {4,5,6};
        MergerSample mergeobj=new MergerSample(ar);
        int[] result=mergeobj.mergeRecord(ar2);

        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);

    }
}
