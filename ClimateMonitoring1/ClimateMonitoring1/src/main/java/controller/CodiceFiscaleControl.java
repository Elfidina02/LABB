package controller;

public class CodiceFiscaleControl {

    public static boolean ValidCodiceFiscale(String codiceFiscale){
        if(codiceFiscale==null|| codiceFiscale.length()!=16)
            return false;
        String caratteriValidi="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        codiceFiscale=codiceFiscale.toUpperCase();
        for (int i=0 ; i< codiceFiscale.length();i++){
            if(caratteriValidi.indexOf(codiceFiscale.charAt(i))==-1)
            return false;
        }
        return true;
    }
}
