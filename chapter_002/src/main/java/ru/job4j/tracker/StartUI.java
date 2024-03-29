package ru.job4j.tracker;


/**
 * консольное приложение для работы с классом Tracker.
 *
 *  * Запомните общее правило!
 *  * Если класс зависит от внешних ресурсов: система ввода-вывода, база данных, веб-сервисы, эти зависимости нужно разрывать.
 *  * Мы помним, что разорвать эти классы мы может через введение интерфейса.
 *  * Мы уже создали интерфейс ru.job4j.tracker.Input, который отвечает за ввод данных от пользователя.
 *  * Этим интерфейсом мы и будем заменять Scanner.
 *
 * Vladislav (fn1235@bk.ru)
 *
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

    public StartUI(){}

    /**
     * Основой цикл программы.
     *
     * Давайте по шагам опишем, что тут происходит.
     * 0. Выводим список меню для выбора пользователем
     * 1. Мы получаем от пользователя пункт меню.
     * 2. Этот параметр мы используем в качестве индекса в массиве actions.
     * 3. Далее мы получаем из массива один из объектов UserAction (CreateAction, ReplaceAction ....);
     * 4. У полученного объекта вызываем метод execute с передачей параметров input и tracker.
     *
     */
        public boolean init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ",actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
        return run;
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].info());
        }
    }

    /**
     * Запуск программы.
     * @param args
     */
        public static void main(String[] args) {
        Input input = new ConsoleInput(); //  шаг разорвана прямая связь с классом Scanner
        Input validate = new ValidateInput(input);
            Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(1,"Create item"),
                new DeleteAction(2,"Delete item"),
                new EditAction(3,"Edit item"),
                new FindAllAction(4,"FindAll"),
                new SearchByIdActon(5,"SearchById"),
                new ShowItem(6,"ShowItem"),
                new ExitProgram(0,"Exit Program")
        };
        new StartUI().init(validate, tracker, actions);
    }

}
