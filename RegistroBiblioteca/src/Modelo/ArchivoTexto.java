package Modelo;

import Vista.FrmRegistro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoTexto {

    File fichero;
    FileWriter writer;
    PrintWriter pw;
    FileReader reader;
    BufferedReader buffer;

    public ArchivoTexto() {
        this.fichero = null;
        this.writer = null;
        this.pw = null;
        this.reader = null;
        this.buffer = null;
    }

    private boolean establecerFlujo(String nombreArchivo) {
        fichero = new File(nombreArchivo);
        return fichero.exists();
    }

    public boolean abrirArchivoTexto(char modo, String nombreArchivo) {
        try {
            boolean existe = this.establecerFlujo(nombreArchivo);
            switch (modo) {
                case 'a':
                    this.writer = new FileWriter(this.fichero, true);
                    this.pw = new PrintWriter(this.writer);
                    break;
                case 'w':
                    this.writer = new FileWriter(this.fichero, true);
                    this.pw = new PrintWriter(this.writer);
                    break;
                case 'r':
                    if (!existe) {
                        return false;
                    }
                    this.reader = new FileReader(this.fichero);
                    this.buffer = new BufferedReader(this.reader);
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public void crearLinea(String linea) {
        this.pw.println(linea);
    }

    public void cerrarArchivo(char modo) {
        try {
            switch (modo) {
                case 'w':
                case 'a':
                    this.pw.close();
                    this.writer.close();
                    break;
                case 'r':
                    this.buffer.close();
                    this.reader.close();
                    break;
            }

        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String obtenerLineas() {
        String lineas = "";
        try {
            String linea = null;
            linea = buffer.readLine();
            while (linea != null) {
                lineas += linea + "\n";
                linea = buffer.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineas;
    }

    public Object[][] obtenerMatrizLineas(int numColumnas) {
        ArrayList<String> lineas = new ArrayList<>();
        try {
            String linea = buffer.readLine();
            while (linea != null) {
                lineas.add(linea);
                linea = buffer.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Object[][] matrizDatos = new Object[lineas.size()][numColumnas];
        for (int f = 0; f < lineas.size(); f++) {
            String linea = lineas.get(f);
            if (linea.trim().isEmpty()) {
                continue;
            }
            String[] datos = linea.split(",");
            for (int c = 0; c < numColumnas; c++) {
                if (c < datos.length) {
                    matrizDatos[f][c] = datos[c];
                } else {
                    matrizDatos[f][c] = "";
                }
            }
        }
        return matrizDatos;
    }
}
