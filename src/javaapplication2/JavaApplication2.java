/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author rajeshwariy
 */
public class JavaApplication2 {

    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rajeshwariy
 */

    public static void main(String h[])
    {  
        int s[]={2,4,2,7,6,8,6,3,1,8,9,9,9,9,8};
        int b[]=new int[15];
        for(int i=0,j=0;i<s.length;i++)
        {
            if(i==0)
            {
               b[j]=s[i]; 
               j++;
            }
            else if(i>0 & i<s.length)
            {  boolean f=false;
                for(int k=0;k<j;k++)
                {
                    if(s[i]==b[k]){
                      f=true;  
                    }
                }
                if(f==false)
                {
                    b[j]=s[i];
                    j++;
                }
            }
        }
        for(int m=0;m<b.length;m++)
        {
        System.out.print(b[m]);
        }
    }
    
}
