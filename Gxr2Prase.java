import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Gxr2Prase {
	public static void main(String[] args) {
		String inputFile=args[0];
		String outputFile=args[1];
        try {
            Scanner input=new Scanner(new File(inputFile));
            FileWriter output=new FileWriter(outputFile);
            int j=1,b=1;
            while(input.hasNext()){
            	output.write("Burst "+b+"\n");
                if(j<=17){
                	while(j<=17){
                		input.next();j++;
                	}
                }
                if(17<j&&j<=340){
                    output.write("Branch A:");
                    while(j<=340){
                    	output.write(input.next()+" ");j++;
                    }
                    output.write("\n");
                }
                if(340<j&&j<=663){
                	output.write("Branch B:");
                    while(j<=663){
                    	output.write(input.next()+" ");j++;
                    }
                    output.write("\n");
                }
                if (663<j&&j<=986){
                	output.write("Branch C:");
                    while(j<=986){
                    	output.write(input.next()+" ");j++;
                    }
                    output.write("\n");
                }
                if (986<j&&j<=1309){
                	output.write("Branch D:");
                    while(j<=1309){
                    	output.write(input.next()+" ");j++;
                    }
                    output.write("\n");
                }
		input.next();
                j=1;
           	b++;
            }
	   output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        
    }
}

