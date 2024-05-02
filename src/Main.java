import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");
        // Declaración de variables
        int releaseDate = 1998;
        double evaluation = 5.0;
        boolean isInBasicPlan = true;
        String name = "The Truman Show";
        String synopsis = """
                The Truman Show is a thought-provoking drama about Truman Burbank, whose entire life is broadcasted
                as a reality TV show without his knowledge. As Truman starts to question his reality, he embarks on
                a journey to discover the truth behind his existence.
                """;
        double averageUserRate = 0;

        System.out.println("Movie: " + name);
        System.out.println(releaseDate);
        System.out.println(evaluation);
        System.out.println(isInBasicPlan);

        double averageRate = (4.5 + 4.8 + 3) / 3;
        System.out.println("Average rate for " + name + ": " + averageRate);
        int currentYear = 2024;
        if (releaseDate >= currentYear){
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        int loop = 3;
        for (int i = 0; i < loop; i++) {
            Scanner rateInput = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a " + name);
            double movieRating = rateInput.nextDouble();
            averageUserRate = averageUserRate + movieRating;
        }
        System.out.println("La media de la película " + name +
                " calculada por el usuario es: " + averageUserRate / loop);

    }
}