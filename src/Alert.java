
import java.util.ArrayList;
import java.util.List;

public class Alert {
    private int id;
    private int eventId;
    private String time;
    private String type;
    private String dangerLevel;
    private String status;
    private List<Message> messages;

    public Alert(int id, int eventId, String time, String type,
                 String dangerLevel, String status) {
        this.id = id;
        this.eventId = eventId;
        this.time = time;
        this.type = type;
        this.dangerLevel = dangerLevel;
        this.status = status;
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (message != null) {
            messages.add(message);
        }
    }

    public void elevateDangerLevel(String newLevel) {
        if (newLevel != null && !newLevel.isEmpty()) {
            dangerLevel = newLevel;
            status = "Підвищена увага";
        }
    }

    public void resolveAlert() {
        status = "Вирішено";
    }

    public int getId() {
        return id;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    @Override
    public String toString() {
        return "Сповіщення: id=" + id
                + ", ID події=" + eventId
                + ", Час='" + time + '\''
                + ", Тип='" + type + '\''
                + ", Рівень небезпеки='" + dangerLevel + '\''
                + ", Статус='" + status + '\''
                + ", Кількість повідомлень=" + messages.size();
    }
}
