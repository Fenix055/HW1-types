public class Main {
    public static void print(Object... args){
        for (byte i=0; i< args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        /// Task 1
        float dog = 8.0f;
        float cat = 3.6f;
        int paper = 763789;
        print(dog, cat, paper);

        /// Task 2
        dog += 4;
        cat += 4;
        paper += 4;
        print(dog, cat, paper);

        /// Task 3
        var x = 3.5;
        dog-=x;

        x=1.6;
        cat-=x;

        x=7639;
        paper-=x;

        print(dog, cat, paper);

        /// Task 4

        var friend = 19;
        print(friend, friend+=2, friend/=7);

        /// Task 5
        var frog = 3.5;
        print(frog, frog*=10, frog/=3.5, frog+=4);

        ///  Task 6
        var first = 78.2;
        var second = 82.7;
        print(first+second, second-first);

        ///  Task 7
        print (second%first);

        ///  Task 8
        var work = 640;

        System.out.println("Всего работников в компании — " + work/8 + " человек");
        System.out.println("Если в компании работает " +(work/8+94)+ " человек, то всего "+ (work+8*94) +" часов работы может быть поделено между сотрудниками");
    }
}