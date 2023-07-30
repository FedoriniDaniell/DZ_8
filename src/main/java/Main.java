public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormDate newDay = new FormDate();

        newDay.day = 21;
        newDay.month = 5;
        newDay.year = 1986;

        post.birthday = newDay;
        post.name = "Dan";
        post.surname = "Ivanov";
        post.patronymic = "Ivanovich";
        post.passport = "4030 34030";
        post.phone = "+7 906 9459 09";
        post.subscription = true;
    }
}
