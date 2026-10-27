import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // створення зони моніторингу
        MonitoringZone zone = new MonitoringZone(
                1, "Південний сектор",
                "46.48, 30.73", "Активно", "Середній");

        // створення сповіщення
        Alert alert = new Alert(
                501, 8945, "08:02",
                "Загроза БПЛА", "Високий", "Новий");

        // Створення повідомлень
        Message msg1 = new Message(
                10, "08:03",
                "Увага! Зафіксовано об'єкт.", "Оператор");

        Message msg2 = new Message(
                11, "08:04",
                "Рівень небезпеки підвищено.", "Система");

        // Встановлення зв'язків між об'єктами
        zone.addAlert(alert);
        alert.addMessage(msg1);
        alert.addMessage(msg2);

        // робота методів
        zone.activateZone("Критичний");
        alert.elevateDangerLevel("Максимальний");

        // виведення результатів
        out.println(alert);

        for (Message message : alert.getMessages()) {
            out.println(message);
        }

        // демонстрація зміни статусу
        alert.resolveAlert();
        zone.deactivateZone();

        out.println("\nПісля завершення події:");
        out.println(zone);
        out.println(alert);
    }
}
