package org.example;

import java.io.IOException;
import java.util.Date;

public class HttpController {

    public static void savePayment(PaymentDetails paymentDetails) {
        System.out.println("payment was saved");


    }



    public static PaymentDetails getThePayment(Long PaymentId) {
        Date date = new Date();

        PaymentDetails paymentDetails = new PaymentDetails(1l,"Kolya","1", date,1,1,1,1,1);

        return paymentDetails;
    }

    public static void deleteThePayment(Long PaymentId) {

        System.out.println("payment was deleted");
    }




    public static void connect(Long id) throws IOException {

        String url = "http://localhost:8080/payments/1";

        PaymentDto[] books = null;
        // Create an asyn HttpClient
        CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
        try {
            httpclient.start();
            HttpGet request = new HttpGet(URI_BOOK);
            Future<HttpResponse> future = httpclient.execute(request, null);
            // Wait and retrieve the result
            HttpResponse response = future.get();
            System.out.println("Response code:" + response.getStatusLine().getStatusCode());
            // Determine whether the request was successfully or not
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity httpEntity = response.getEntity();
                // Create a Jackson ObjectMapper to convert the JSON response to Java objects
                ObjectMapper mapper = new ObjectMapper();
                // Read the inputstream and convert to an array of Book
                books = mapper.readValue(httpEntity.getContent(), Book[].class);
            }
        } finally {
            HttpAsyncClientUtils.closeQuietly(httpclient);
        }
        return books;
    }


    }
}
