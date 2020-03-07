class Square
{
	public static void main(String[] args) {
	  
	   
	   for (int i=1;i<=16 ;i++ ){
	       if(i==1){
	           for(int l=1;l<=4;l++){
	                System.out.print(l);
	           }
	       }
	       else if(i==5){
        	         for(int j=8;j>4;j--){
        	               System.out.print(j);  
        	        }  
        	       
	       }
	       else if(i==9){
	           for (int m=9;m<=12 ;m++ ){
	               System.out.print(m);
	           } 
	       }
	        else if(i==13){
	            for(int k=16;k>12;k--){
        	               System.out.print(k);  
        	        } 
        	        
	        }
	        System.out.println();
	   }
           
	}
}