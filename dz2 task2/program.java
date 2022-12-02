// 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.logging.*;

public class program {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array;
        Logger logger = Logger.getLogger(program.class.getName());
        boolean append = true;
        FileHandler fh = new FileHandler("Z2.txt",append);
        logger.addHandler(fh);
        array = new int[] {99,8,7,9,1,88,65,20,90,5}; 
        //fh.setFormatter();
        
        //logger.info("Тестовое логирование");

        //System.out.println(array);
        for (int i = 0; i < array.length; i++){    
            System.out.print(array[i] + " ");   
            
        }
        System.out.println(" ");
        for (int out = array.length - 1; out >= 1; out--){  
            for (int in = 0; in < out; in++){       
                if(array[in] > array[in + 1])  
                    {             
                    //toSwap(in, in + 1); 
                    int dummy = array[in];      
                    array[in] = array[in + 1];       
                    array[in + 1] = dummy;
                    String s = "";
                    for (int i = 0; i < array.length; i++){    
                        s = s + Integer.toString(array[i]) + " ";   
                        
                    }
                    logger.log(Level.FINE, "OK");
                    logger.info(s);
                    }
            }
        }            
        //System.out.println(array);
        for (int i = 0; i < array.length; i++){    
            System.out.print(array[i] + " ");   
            
        }
        System.out.println(" ");
    } 
}