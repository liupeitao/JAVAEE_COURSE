package liu.mapper.pojo;

public class subArray {
    public static void main(String[] args) {
        int []a = {3,-43,44,45,-1,-5,314,34};

        int thisp = 0;
        int i = 0;
        int max = 0;
        for(i = 0 ; i < a.length; i++ )
        {
            thisp += a[i];

            if(thisp > max)
                max = thisp;
            else if(thisp < 0)
                thisp = 0;
        }


        System.out.println("max subArray is : " + max );

    }
}
