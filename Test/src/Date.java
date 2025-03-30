import java.util.Objects;

public class Date {
    private int day;
    private String name;

    public Date(int day, String name) {
        this.day = day;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Date other = (Date) obj;
        if(this.day != other.day) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }


}
