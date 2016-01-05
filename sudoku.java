import java.util.*;
public class Sudoku {
	private static void swap(int[][] aa, int i, int j, int k, int l) {
		int rr=aa[i][k];
		aa[i][k]=aa[j][l];
		aa[j][l]=rr;
	}
	private static void swap1(int[][] aa, int i, int j, int w) {
		int nn=aa[i][w];
		aa[i][w]=aa[j][w];
		aa[j][w]=nn;
	}
	private static void swap2(int[][] aa, int i, int j, int w) {
		int mm=aa[w][i];
		aa[w][i]=aa[w][j];
		aa[w][j]=mm;
	}
	
	private static int r=-1,jj=0;
   public static void main(String[] arg){
	   Scanner s= new Scanner (System.in);
	   int n= s.nextInt();
	   for(int i=0;i<n;i++){
		   System.out.println("Case"+" "+"#"+(i+1)+":");
		   r=-1;jj=0;
		   int[][] aa= new int[9][9];
		   int[] count=new int[18];
		   for(int j=0;j<9;j++){
			   String str="";
			   for(int k=0;k<9;k++){
				   aa[j][k]=s.nextInt(); 
				   str+=aa[j][k];
				   }
			       r++;
			       char[] t=str.toCharArray();
			       Arrays.sort(t);
			       str=new String(t);
			    
				   if(!str.equals("123456789")){
					   count[r]=1;
					   jj++;
				   } }
		   for(int k=0;k<9;k++){
			   String str="";
			   for(int j=0;j<9;j++){ 
				   str+=aa[j][k];
				   }
			       r++;
			       char[] t=str.toCharArray();
			       Arrays.sort(t);
			       str=new String(t);
			    
				   if(!str.equals("123456789")){
					   count[r]=1;
					   jj++;
				   }
		   }
		   if(jj==0){
			   System.out.println("Serendipity");
		   }
		   if(jj==2){int e=0,yy=0;
		   int[] gg=new int[2];
			   for(int u=0;u<9;u++){
				   if(count[u]==1){
					   gg[e++]=u;
				   }}
			   if(e==2){
				   for(int w=0;w<9;w++){
					   swap1(aa,gg[0],gg[1],w);
					   String sr="";
					   for(int q=0;q<9;q++){
						   sr+=aa[(gg[0])][q];
					   }
					   char[] tt=sr.toCharArray();
				       Arrays.sort(tt);
				       sr=new String(tt);
					   if(sr.equals("123456789")){
						   System.out.println("("+(gg[0]+1)+","+(w+1)+")"+" "+"<"+"-"+">"+" "+"("+(gg[1]+1)+","+(w+1)+")");
						   break;
					   }
					   else{
						   swap1(aa,gg[0],gg[1],w);
					   }
				   }
			   }
			   else{
				  
				   for(int u=9;u<18;u++){
					   if(count[u]==1){
						   gg[e++]=u;
					
					   }
				   }
				   
				   for(int w=0;w<9;w++){
					   swap2(aa,gg[0]-9,gg[1]-9,w);
					   String sr="";
					   for(int q=0;q<9;q++){
						   sr+=aa[q][(gg[0]-9)];
					   }
					   char[] tt=sr.toCharArray();
				       Arrays.sort(tt);
				       sr=new String(tt);
					   if(sr.equals("123456789")){
						   System.out.println("("+(w+1)+","+(gg[0]-8)+")"+" "+"<"+"-"+">"+" "+"("+(w+1)+","+(gg[1]-8)+")");
						   break;
					   }
					   else{
						   swap2(aa,gg[0]-9,gg[1]-9,w);   	   
                       }}}}
		   
		   if(jj==4){
			   int[] gg=new int[4];
			   int e=0,kk=0;
			   for(int u=0;u<18;u++){
				   if(count[u]==1){
					   gg[e]=u;
					   e++;
				   }
			   }
			   
			   if(kk==0){
			  swap(aa,gg[0],gg[1],(gg[2]-9),(gg[3]-9));
			   String sr="";
			   for(int q=0;q<9;q++){
				   sr+=aa[q][(gg[2]-9)];
			   }
			   char[] tt=sr.toCharArray();
		       Arrays.sort(tt);
		       sr=new String(tt);
			   if(sr.equals("123456789")){
				   System.out.println("("+(gg[0]+1)+","+(gg[2]-8)+")"+" "+"<"+"-"+">"+" "+"("+(gg[1]+1)+","+(gg[3]-8)+")");
				   kk=1;
			   }
			   else{
				 swap(aa,gg[0],gg[1],gg[2],gg[3]);
			   }}
			   if(kk==0){
			   swap(aa,gg[0],gg[1],(gg[3]-9),(gg[2]-9));
			   
			   String ssr="";
			   for(int q=0;q<9;q++){
				   ssr+=aa[q][(gg[2]-9)];
			   }
			   char[] ttt=ssr.toCharArray();
		       Arrays.sort(ttt);
		       ssr=new String(ttt);
			   if(ssr.equals("123456789")){
				   System.out.println("("+(gg[0]+1)+","+(gg[2]-8)+")"+" "+"<"+"-"+">"+" "+"("+(gg[1]+1)+","+(gg[3]-8)+")");
				   kk=1;
			   }
			   else{
				   swap(aa,gg[0],gg[1],(gg[3]-9),(gg[2]-9));
               }}}}}}

