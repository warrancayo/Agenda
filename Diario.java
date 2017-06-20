/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diario;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Wanni
 */
public class Diario 
{
    //lista Dias
    //string fecha
    ArrayList<Nota> diario;
    Path texto;
    public Diario()
    {
        diario = new ArrayList();
        File texto = new File("C:\\Desktop\\Diario.txt");
        
        
    }
    
    public String scanDiario() throws FileNotFoundException, IOException
    {
        String aux = "";
        Scanner sc = new Scanner(texto);
        
        while(sc.hasNextLine()){
            aux+=sc;
        }//end of while
        return aux;
    }//end of scnadiario
    
    public File addNote(File nuevaNota, String noteName) throws FileNotFoundException
    {
        String temp= "";
        
        temp = scanDiario();
        temp = temp +" "+diario.get(diario.size()-1).fecha
                +" "+diario.get(diario.size()-1).nota;
        
        
        return null;
        
    }
    
    
    
}
