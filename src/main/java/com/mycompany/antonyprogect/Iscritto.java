/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.antonyprogect;
import java.io.*;
/**
 *
 * @author anton
 */
public class Iscritto implements Serializable{
    public String cognome;
    public String nome;
    public String abbonamento="";
    public double età;
    public Iscritto(String cognome,String nome,double età,String abbonamento)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.abbonamento=abbonamento;
        this.età= età;
    }
}
