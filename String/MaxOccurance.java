

public class MaxOccurance {
  public static void main(String[]args){
    String s="abbccccdddde";
    char maxchar=' ';
    int max=0;
    while(s.length()>0){
      char ch=s.charAt(0);
      String s2=s.replace(ch+" "," ");
      int count=s.length() - s2.length();
      if(count>max){
         max =count;
         maxchar=ch;
    }
         s=s2;
    }
         System.out.println(maxchar +"="+ max);
    }
    }
  
