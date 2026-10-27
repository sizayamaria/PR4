
public class Message {
    private int id;
    private String timestamp;
    private String content;
    private String sender;

    public Message(int id, String timestamp,
                   String content, String sender) {
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
        this.sender = sender;
    }

    void sendSystemMessage() {
        System.out.println(
                "Відправка системного повідомлення від: " + sender);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Повідомлення: id=" + id
                + ", Час='" + timestamp + '\''
                + ", Зміст='" + content + '\''
                + ", Відправник='" + sender + '\'';
    }
}
