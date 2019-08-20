package com.Nonthwatzaza.ECP;
public class animal {
        private String age;
        private String hungry;

        public String  ate ()
        {
            System.out.println("ate");
            return "animal";
        }
        public String rest ()
        {
            System.out.println("rest");
            return "animal";
        }

    class fish extends animal
    {
        private String name;

        public String rest()
        {
            System.out.println("rest");
            return "animal";
        }
    }


    }
    public class apes extends animal
    {
        public String Collectkokonut()
        {
            System.out.println("apesCollectkokonut");
            return "animal";
        }
    }