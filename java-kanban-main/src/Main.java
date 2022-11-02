import model.Status;
import service.Manager;


public class Main {

    public static void main(String[] args)  {
        Manager manager = new Manager();

        manager.createOrUpdateCommonTask(null, "Закончить курс Java", "За 8 месяцев",
                Status.IN_PROGRESS);
        manager.createOrUpdateCommonTask(null, "Зокончить 3 курс", "К июлю 2023 года",
                Status.IN_PROGRESS);
        manager.createOrUpdateEpicTask(null, "Купить MacBook", "До конца 2023 года",
                Status.NEW);
        manager.createOfUpdateSubTask(null, "Накопить денег с праздников",
                "Откладывть деньги", Status.IN_PROGRESS, 3);
        manager.createOfUpdateSubTask(null, "Визуализировать покупку",
                "Выбрать нужную модель", Status.DONE, 3);
        manager.createOrUpdateEpicTask(null, "Купить машину", "Желательно до конца 2023",
                Status.NEW);
        manager.createOfUpdateSubTask(null, "Отклдывать деньги с ЗП",
                "Каждый месяц по 30%", Status.IN_PROGRESS, 6 );
        System.out.println(manager.getListOfAllTask());



    }

}
