
//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

// Classe principale, con metodo main
class Esercizio {
    
    private static Scanner input = new Scanner(System.in);
    private static Scanner infile;
    private static FileWriter outfile;

    public static void main(String[] args) throws Exception {
        String inputFileName, outFileName, riga;

        System.out.println("nome del file di input: ");
        inputFileName = input.nextLine();
        System.out.println("nome del file di output: ");
        outFileName = input.nextLine();
        infile = new Scanner(new FileReader(inputFileName));
        outfile = new FileWriter(new File(outFileName));
        do {
            riga = infile.nextLine();
            riga = inverti(riga);
            outfile.write(riga + "\n");
        } while ( infile.hasNextLine() );
        infile.close();
        outfile.close();
    }
    
    public static String inverti(String riga) {
        int n, i;
        String agir;

        agir = "";
        n = riga.length();
        for (i = n - 1; i >= 0; i--) {
            agir = agir + riga.charAt(i);
        }
        
        return agir;
    }
}
