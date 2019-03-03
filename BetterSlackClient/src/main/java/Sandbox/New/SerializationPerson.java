package Sandbox.New;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializationPerson {

    public static void main(String[] args) throws JsonProcessingException {


        Person person = new Person("John", "Smith", 30);

        person.addPurchase(new Purchase("laptop",5234.99));
        person.addInteger(1);
        person.addInteger(2);
        person.addInteger(3);

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT,true);
        String json = mapper.writeValueAsString(person);
        System.out.println(json);
    }
}
