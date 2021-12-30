package StaticKeywords;

import java.util.Arrays;

public class StringSorting 
{
	
	public static void main(String args[])   
	{  
	 
	String[] state = {"Maharashtra", "Arunachal", "Andhra Pradesh", "Kerla","Tamil Nadu","Punjab"};  
	int size = state.length;  
	for(int i = 0; i<size-1; i++)   
	{  
	for (int j = i+1; j<state.length; j++)   
	{  
	 if(state[i].compareTo(state[j])>0)    
	 {  
	   String temp = state[i];  
	   state[i] = state[j];  
	   state[j] = temp;  
	 }  
	}  
	}  
	System.out.println(Arrays.toString(state));  
	}  
 }  

