/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diario;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Wanni
 */
public class Nota 
{
    File nota;
    Object fecha;
    public Nota(String tituloNota)
    {
        nota = new File("C:\\Desktop\\"+tituloNota);
        fecha = Date.from(Instant.EPOCH);
    }
    
    public String getNota(File tempNota) throws FileNotFoundException
    {
        String aux = "";
        Scanner sc = new Scanner(tempNota);
        while(sc.hasNextLine())
        {
            aux+=sc.nextLine();
            
        }
        
        return "Titulo: "+this.nota+" Fecha: "+ fecha+" Nota: "+aux;
    }
    
}
