package creationalPatterns.singleton;

import java.security.PrivateKey;

public class Singleton {
   private String data;
   private static volatile Singleton instance;

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   private Singleton() {

   }

   public static Singleton getInstance(String data) {
      if (instance == null) {
         synchronized (Singleton.class) {
            if (instance == null) {
               instance = new Singleton(data);
               return instance;
            }
         }
      }
      return instance;
   }

   private Singleton(String data) {
      this.data = data;
   }

}