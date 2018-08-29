import java.util.Random;


public class Test
{
    public static void main(final String args[])
    {

        for (int i = 0; i < 10; i++)
        {
            final Car c = new Car(4);
            System.out.println("Car " + i + ": \nWheels: " + c.getWheels() + "\nSPEED: "
                    + c.getSpeed() + "\nPlate: " + c.getPlates() + "\n\n");
        }
    }

    private static class Car
    {
        int    wheels;
        int    speed;
        String plates;

        private Car(final int w)
        {
            final Random s = new Random();

            wheels = w;
            speed = 10 + s.nextInt(120);
            plates = generatePlates();
        }

        private String generatePlates()
        {
            String p = "";
            final Random plate = new Random();
            final String alphabet = "0123456789abcdefghijklmonpqrstuvwxyz";

            for (int i = 0; i < 6; i++)
            {
                final int indexToGet = plate.nextInt(35);
                final String add = Character.toString(alphabet.charAt(indexToGet));
                p += add;
            }

            return p.toUpperCase();
        }

        public int getWheels()
        {
            return wheels;
        }

        public int getSpeed()
        {
            return speed;
        }

        public String getPlates()
        {
            return plates;
        }
    }
}