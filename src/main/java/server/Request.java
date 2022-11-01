package server;

public class Request {
    private String type;
    private String key;
    private String value;
    private String inputFile;

    public String getType() {
        return type;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return type + " " + key + " " + value;
    }
}