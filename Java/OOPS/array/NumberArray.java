//Task 19-02-2024
//1. Declare a array of type integer
//1. find the sum of all the array elements
//2. find the max element of the array
//3. find the min element of the array
//4. find the target number in present in array or not
//5. reverse a array
//6. display the duplicates elements in an array
//7. display the even numbers count
//8. display the odd numbers count
//9. display the elements, if elements is multiple of 9
//10. display the prime numbers in a given array


package com.xworkz.array;


public class NumberArray {
    public static int[] number={1,7,9,6,8,9,4,5,6,7,22,45,67,88,76,55,43,21,11,99};

    public static void sum()
    {
        int sum=0;
        for(int numbersum:number)
        {
            sum+=numbersum;
        }
        System.out.println(sum);
    }
    public static void max()
    {
        int max=Integer.MIN_VALUE;
        for(int numbermax:number)
        {
            if(max<numbermax)
            {
                max=numbermax;
            }
        }
        System.out.println(max);
    }
    public static void min()
    {
        int min=Integer.MAX_VALUE;
        for(int numberMin:number)
        {
            if(min>numberMin)
            {
                min=numberMin;
            }
        }
        System.out.println(min);
    }

    public static  void target()
    {
        for(int targetNumber:number)
        {
            if(targetNumber==99)
            {
                System.out.println("Yess given number "+targetNumber +" is present");
            }
        }
    }
    public static void reverse()
    {
        System.out.println("Reverse array :");
        for(int i= number.length-1;i>=0;i--)
        {
            System.out.print(number[i]+" ");
        }
    }
    public static void duplicate()
    {
        System.out.println();
        System.out.println("Duplicate item are follows");
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]==number[j])
                {
                    System.out.print(number[i]+" ");
                }
            }

        }
    }
    public static void evenCount()
    {
        int evenCount=0;
        for(int even:number)
        {
            if(even%2==0)
            {
                evenCount++;
            }
        }
        System.out.println();
        System.out.println("The count of Even number in given Array :"+evenCount);
    }
    public static void oddCount()
    {
        int oddCount = 0;
        for (int odd : number)
        {
            if (odd % 2 != 2)
            {
                oddCount++;
            }
        }
        System.out.println("The count of Odd Number :" + oddCount);
    }

        public static void multipleOfNine()
        {
            System.out.println("The Multiple of 9");
            for(int nine:number)
            {
                if(nine%9==0)
                {
                    System.out.println(nine);
                }
            }
        }
    public static void prime() {
        System.out.println("Prime number in given array :");
        for (int i = 0; i < number.length; i++) {
            int count = 0;

            for (int j = 1; j <= number[i]; j++) {
                if (number[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(number[i]);
            }
        }
    }


}
