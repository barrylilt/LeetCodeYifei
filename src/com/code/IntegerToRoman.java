package com.code;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerToRoman {
	static String intToRoman(int num) {
         ArrayList<Double> list=new ArrayList<Double>();
         int n=0;
    
    String result="";
    
    while (num!=0){
        int tail=num % 10;            
        Double number=Math.pow(10, n) * tail;
        list.add(number);            
        n=n+1;
        num=num/10;
    }
    
    Collections.reverse(list);
    
    for(int i=0; i<list.size(); i++){
        String str=convert(list.get(i));
        result=result+str;
    }
   
        return result;
}
    
static String convert(Double number){
    
     String sb="";
    if(number==0) sb="";
    
    if(number>=1000) {
       
           while(number>=1000){
              sb=sb+"M";
               number=number-1000;
           }          
        }
    
    if(number==900){          
        sb="CM";          
    }    
    
    if(number>=500 && number<=800){
        sb=sb+"D";
        while(number>500){
            sb=sb+"C";
            number=number-100;}  
    }    
    
     if(number==400){
       sb="CD";
    }    
     if(number<=300 && number>=100){
     
        while(number>=100){
            sb=sb+"C";
            number=number-100;}                     
    }
    
    if(number==90){           
        sb="XC";
}
    
    if(number<=80 && number>=50){           
        sb=sb+"L";
        while(number>50){
            sb=sb+"X";
            number=number-10;
    }                     
}
    
    if(number==40){        
        sb="XL";
    }
    
    
    if(number<=30 && number>=10){         
        while(number>=10){
            sb=sb+"X";
            number=number-10;                               
        }           
    }     
    
   if(number==9){                  
       sb="IX";           
   }
    
    if(number<=8 && number>=5){         
       sb=sb+"V";
        
       while(number>5){
           sb=sb+"I";
           number=number-1;
       }         
   }
    
    if(number==4){
        
        sb="IV";
    }
    
    if(number<=3 && number>=1){
                 
        while(number>0){
            sb=sb+"I";
            number=number-1;
        }         
    }
    
    
    return sb;
}

public static void main(String arg[]){
	 int num=3999;
	System.out.println(intToRoman(num));
}
}
