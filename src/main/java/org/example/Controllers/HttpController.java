package org.example.Controllers;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.example.Pojos.PaymentDetails;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class HttpController {

    public static void savePayment(PaymentDetails paymentDetails) {
        System.out.println("payment was saved");


    }



    public static PaymentDetails getThePayment(Long PaymentId) {
        Date date = new Date();

        PaymentDetails paymentDetails = new PaymentDetails(1l,"1","1", date,1,1,1,1,1);

        return paymentDetails;
    }

    public static void deleteThePayment(Long PaymentId) {

        System.out.println("payment was deleted");
    }




    public static void connect() throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();

        //Creating a HttpGet object
        HttpGet httpget = new HttpGet("http://localhost:8080/clients");

        //Printing the method used
        System.out.println("Request Type: " + httpget.getMethod());

        //Executing the Get request
        HttpResponse httpresponse = httpclient.execute(httpget);

        Scanner sc = new Scanner(httpresponse.getEntity().getContent());

        //Printing the status line
        System.out.println(httpresponse.getStatusLine());
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }






}