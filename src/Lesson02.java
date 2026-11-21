public class Lesson02 {
    public static void main(String[] args){
        int age = 17;

        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }


        int number = 15;
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number == 0) {
            System.out.println("Равно 0 ");
        } else {
            System.out.println("Отрицательное ");
        }


        int pass = 12345;
        String login = "Admin";

        if (login.equals("Admin") && pass == 12345) {
            System.out.println("Авторизация успешна");
        } else {
            System.out.println("Неверный логин или пароль");
        }

        int statusCode = 200;
        boolean responseBodyIsValid = true;
        if (statusCode == 200 && responseBodyIsValid == true) {
            System.out.println("API test PASSED");
        } else {
            System.out.println("API test FAILED");
        }
    }
}
