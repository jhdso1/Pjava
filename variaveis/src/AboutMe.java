public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String lastName = args[1];
        int idade = Integer.valueOf(args[2]);
        double heigth = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + name + " " + lastName);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + heigth + "m");
    }
}
