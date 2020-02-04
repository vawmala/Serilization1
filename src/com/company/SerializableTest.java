package com.company;


import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {

       CreditCard creditCard = new CreditCard(CardType.MASTERCARD,"Privat",41497745,"01/22",355);

       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("card.txt"))) {
            oos.writeObject(creditCard);
        } catch (IOException e) {
            e.printStackTrace();
        }

   }
}
