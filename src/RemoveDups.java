import java.util.Arrays;

public class RemoveDups {
    public static void main(String args[]) {
    String[] strArr=new String[]{"horse", "dog", "cat", "horse", "dog"};
        for(int i=0;i<strArr.length;i++)
        {
            if(strArr[i]!=null)
            {

                for(int j=i+1;j<strArr.length;j++)
                {

                    if(strArr[i].equals(strArr[j]))
                    {
                        strArr[j]=null;
                    }
                }
            }
        }

        for(int k=0;k<strArr.length;k++)
        {
            if(strArr[k]!=null)
            {
                System.out.println(strArr[k]);
            }

        }

    }
}
