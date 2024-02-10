public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var totalWeightOfBoxers=firstBoxer+secondBoxer;
        System.out.println("Общая масса боксеров "+totalWeightOfBoxers+" кг");
        var boxerDifference=secondBoxer-firstBoxer;
        System.out.println("Разница масс боксеров "+boxerDifference+ " кг");
        var difference=secondBoxer%firstBoxer;
        System.out.println(difference);

        var workingHours=640;
        var workingHoursForOne=8;
        var amountOfWorkers=workingHours/workingHoursForOne;
        System.out.println("Всего работников в компании - "+amountOfWorkers+" человек.");
        amountOfWorkers=amountOfWorkers+64;
        var totalWorkingTime=amountOfWorkers*8;
        System.out.println("Если в компании работает "+amountOfWorkers+" человек, то всего "+totalWorkingTime+" часов работы может быть поделено между сотрудниками");




    }
}