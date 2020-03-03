package com.example.nodeproject;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



import javax.net.ssl.HttpsURLConnection;

public class HttpInfo extends AsyncTask<Void, Void, String>{

    
    private String text;
    public int n;


    @Override
        protected String doInBackground(Void... voids) {
            try {
                URL site = new URL("http://192.168.12.122/evento");
                HttpURLConnection con =
                        (HttpURLConnection) site.openConnection();
                con.setRequestMethod("GET");
//                con.setRequestProperty("Content-type", "application/json");
//                con.setRequestProperty("Accept", "application/json");
//                con.setDoOutput(true);
//                con.setConnectTimeout(5000);
                con.connect();
             int codigoresposta;
             InputStream is;
             codigoresposta = con.getResponseCode();
                if(codigoresposta < HttpURLConnection.HTTP_BAD_REQUEST){
                    is = con.getInputStream();
                }else{
                    is = con.getErrorStream();
                }

                StringBuffer buffer = new StringBuffer();
                try{
                    BufferedReader br;
                    String linha;

                    br = new BufferedReader(new InputStreamReader(is));
                    while((linha = br.readLine())!=null){
                        buffer.append(linha);
                    }
                    text = buffer.toString();
                    br.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            } catch (Exception e) {
                System.out.println("Erro Java: " + e.getMessage());
            }

            return null;
        }



    }






