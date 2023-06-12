import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;

public class ManagerTest {

    @Test
    public void test1() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Bloodshot 1");
        manager.addNewFilm("Onward 2");
        manager.addNewFilm("The Gentlemen 3");

        String[] actual = manager.findAll();
        String[] expected = { "Bloodshot 1", "Onward 2", "The Gentlemen 3" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();



        String[] actual = manager.findAll();
        String[] expected = { };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Bloodshot 1");


        String[] actual = manager.findAll();
        String[] expected = { "Bloodshot 1" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Bloodshot 1");
        manager.addNewFilm("Onward 2");
        manager.addNewFilm("The Gentlemen 3");

        String[] actual = manager.findLast();
        String[] expected = { "The Gentlemen 3", "Onward 2", "Bloodshot 1" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Bloodshot 1");
        manager.addNewFilm("Onward 2");
        manager.addNewFilm("The Gentlemen 3");
        manager.addNewFilm("Leon 4");
        manager.addNewFilm("Inception 5");

        String[] actual = manager.findLast();
        String[] expected = { "Inception 5", "Leon 4", "The Gentlemen 3", "Onward 2", "Bloodshot 1" };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Bloodshot 1");
        manager.addNewFilm("Onward 2");
        manager.addNewFilm("The Gentlemen 3");
        manager.addNewFilm("Leon 4");
        manager.addNewFilm("Inception 5");
        manager.addNewFilm("Gladiator 6");

        String[] actual = manager.findLast();
        String[] expected = { "Gladiator 6", "Inception 5", "Leon 4", "The Gentlemen 3", "Onward 2" };

        Assertions.assertArrayEquals(expected, actual);
    }



}
