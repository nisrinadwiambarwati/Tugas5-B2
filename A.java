
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
class A {
    public static void main (String[] args) {
        System.out.println("awal program");

        try {
            System.out.println("Baris ini tidak akan dieksekusi - 1.2");    

            File f = new File ("hello.txt");
            InputStream fis = new FileInputStream(f);

            System.out.println("Baris ini tidak akan dieksekusi - 1.3");    
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Baris di dalam finally akan dieksekusi");
        }

        System.out.println("akhir program");
    }
}
