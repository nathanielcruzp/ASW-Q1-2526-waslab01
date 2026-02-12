package fib.asw.waslab01_cs;

import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;

//This code uses the Fluent API

public class SimpleFluentClient {

    private static final String URI = "http://localhost:8080/waslab01_ss/";

	public static void main(String[] args) throws Exception {

		/* Insert code for Task #4 here */
        Request.post(URI)
                .bodyForm(Form.form().add("author",  "finn").add("tweet_text",  "hola mon").build())
                .execute().returnContent();
		
        String result = Request.get(URI)
                .addHeader("Accept", "text/plain")
                .execute()
                .returnContent()
                .asString();

        //System.out.println(Request.get(URI).execute().returnContent());
        System.out.println(result);
        /* Insert code for Task #5 here */
    }
}
