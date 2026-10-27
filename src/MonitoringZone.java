
import java.util.ArrayList;
import java.util.List;

public class MonitoringZone {
    private int id;
    private String name;
    private String coordinates;
    private String status;
    private String monitoringLevel;
    private List<Alert> alerts;

    public MonitoringZone() {
        this(1, "Північний сектор",
                "50.45, 30.52", "Активно", "Високий");
    }

    public MonitoringZone(int id, String name, String coordinates,
                          String status, String monitoringLevel) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.status = status;
        this.monitoringLevel = monitoringLevel;
        this.alerts = new ArrayList<>();
    }

    public void addAlert(Alert alert) {
        if (alert != null) {
            alerts.add(alert);
        }
    }

    public void activateZone(String newMonitoringLevel) {
        if (newMonitoringLevel != null
                && !newMonitoringLevel.isEmpty()) {
            monitoringLevel = newMonitoringLevel;
            status = "Активно";
        }
    }

    public void deactivateZone() {
        status = "Неактивно";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public List<Alert> getAlerts() {
        return new ArrayList<>(alerts);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Зона моніторингу: id=" + id
                + ", Назва='" + name + '\''
                + ", Координати='" + coordinates + '\''
                + ", Статус='" + status + '\''
                + ", Рівень моніторингу='" + monitoringLevel + '\''
                + ", Кількість сповіщень=" + alerts.size();
    }
}
