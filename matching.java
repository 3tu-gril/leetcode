public class matching {
      public static boolean isMatching(String str,String pattern){
    	  int s=0,p=0,match=0,starIndex=-1;
    	  while(s<str.length()){
    		  if(p<pattern.length()&&(str.charAt(s)==pattern.charAt(p)||pattern.charAt(p)=='?')){
    			  s++;
    			  p++;
    		  }else if(pattern.charAt(p)=='*'){
    			  starIndex = p;
    			  match = s;
    			  p++;
    		  }else if(starIndex != -1){
    			  p=starIndex+1;
    			  match++;
    			  s=match;
    		  }
    	  }
    	  while(p<pattern.length()&&pattern.charAt(p)=='*')
    		  p++;
    	  return p==pattern.length();
  }
      public static void main(String [] args){
      	String s =  "a";
      	String p = "?";
      	System.out.println(isMatching(s,p));
      }
}
