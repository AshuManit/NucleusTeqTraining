import java.io.*;
import java.util.*;

class ReadWriteFile{
	static File file=new File("file.txt");
	static FileWriter writer=null;
	static Scanner reader=null;
	
	static{
		try{
		if(file.exists()){
			System.out.println("File Already Exists");
		}else{
			file.createNewFile();
			System.out.println("File created");
			
		}}catch(Exception e){
			System.out.println("Error");
		}
		
	}
	public static void writeInFile(String s){
		try{
		writer=new FileWriter(file,true);
		writer.write("\n"+s);
		}catch(Exception e){
			System.out.println("Error found ");
		}finally{
			try{
			if(writer!=null){
				writer.close();
			}}catch(Exception e){
				System.out.println("File is not closing..");
			}
		}
	}
	public static void readInFile(){
		System.out.println("*****************************************");
		try{
			reader = new Scanner(file);
			while(reader.hasNextLine()){
				String data=reader.nextLine();
				System.out.println(data);
			}
		}catch(Exception e){
			System.out.println("File not found ");
		}finally{
			try{
				if(reader!=null){
					reader.close();
				}
			}catch(Exception e){
				System.out.println("File not closed");
			}
		}
		System.out.println("*****************************************");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		boolean go=true;
		while(go){
			try{
				
				System.out.println("-----------------------------------");
				System.out.println("press 1 for Writing");
				System.out.println("press 2 for Reading");
				System.out.println("press 3 for Exit");
				System.out.println("-----------------------------------");
				int input=sc.nextInt();
				switch(input){
				case 1:
						System.out.println("What do you want to write in File");
						String s=new String();
						sc.nextLine();
						s=sc.nextLine();
						writeInFile(s);
						break;
				case 2:readInFile();
						break;
				case 3:go=false;
						break;
				}//end of switch
				}catch(Exception e){
				
				}
			}//end of while
	}//end of method
}